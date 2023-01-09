public class EmployeesBook {

    public Employee[] empl = new Employee[9];
    public void fillEmpl () {

        empl[0] = new Employee("Илья", "Ильич", "Ильин", 2, 1001.10F);
        empl[1] = new Employee("Семён", "Семёнович", "Семёнов", 3, 2222.15F);
        empl[2] = new Employee("Абу", "ибн Оглы", "Джафаров", 3, 3333.30F);
        empl[3] = new Employee("Джон", "", "Сильвер", 2, 0700.10F);
        // проверка на возможность null
        //        empl[4] = new Employee("Станислав", "Мергкулович", "Станиславский", 3, 4001.40F);
        empl[5] = new Employee("Индира", "махатма", "Ганди", 2, 23451.10F);
        empl[6] = new Employee("Владимир", "Владимирович", "Мономах", 3, 7865.90F);
        empl[7] = new Employee("Михаил", "Потапович", "Косолапенко", 2, 1000.00F);
        empl[8] = new Employee("Илья", "Ильич", "Смелков", 3, 9006.55F);

    }
    public void printEmpl (/*Employee[] employee*/) {
      for (int i = 0 ; i < empl.length; i++ ) {
          System.out.println(empl[i]);
      }
    }

    public void FindMaxSalay() {
        float maxSalary = 0;
        int indexMaxEmployee = 0;
        for (int i = 0; i< empl.length; i++) {
            if (empl[i] == null) { continue; }
            if (maxSalary < empl[i].getSalary()) {
                maxSalary = empl[i].getSalary();
                indexMaxEmployee = i ;
            }
        }
        System.out.println("Максимальная ставка у сотрудника: " + empl[indexMaxEmployee].getFullName());

    }
    public void FindMinSalay() {
        float minSalary = 1000000000;
        int indexMinEmployee = 0;
        for (int i = 0; i< empl.length; i++) {
            if (empl[i] == null) { continue; }
            if (minSalary > empl[i].getSalary()) {
                minSalary = empl[i].getSalary();
                indexMinEmployee = i ;
            }
        }
        System.out.println("Минимальная ставка у сотрудника: " + empl[indexMinEmployee].getFullName());

    }
    public float FindTotalSalay() {
        float sumSalary = 0;
        for (int i = 0; i< empl.length; i++) {
            if (empl[i] == null) { continue; }
            sumSalary = sumSalary + empl[i].getSalary();
        }
        return sumSalary;
    }
    public float FindAvgSalay()  {
        int sumEmployee = 0;
        for (int i = 0; i< empl.length; i++) {
            if (empl[i] == null) { continue; }
            sumEmployee++;
        }
        return FindTotalSalay() / sumEmployee;
    }

    public void listFullName () {
        System.out.println("\nПолный список сотрудников (ФИО): ");
        for (int i = 0; i< empl.length; i++) {
            if (empl[i] == null) { continue; }
            System.out.println(empl[i].getFullName());
        }
    }
}
