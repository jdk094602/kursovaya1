public class Main {
    public static void main(String[] args) {


        EmployeesBook empBook = new EmployeesBook();
        empBook.fillEmpl();
        empBook.printEmpl();
        System.out.printf("Сумма затрат на зарплаты в месяц  = %.2f" + "\n",empBook.FindTotalSalay());
        //System.out.println("\n");
        empBook.FindMaxSalay();
        empBook.FindMinSalay();
        System.out.printf("Средняя ставка по больнице  = %.2f",empBook.FindAvgSalay());
        empBook.listFullName();
        //System.out.println("Hello world!");
    }
}