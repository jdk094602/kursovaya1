public class Main {
    public static void main(String[] args) {

        Employee employee;
        EmployeesBook empBook = new EmployeesBook();
        empBook.fillEmpl();
        empBook.printEmpl();
        System.out.printf("Сумма затрат на зарплаты в месяц  = %.2f" + "\n",empBook.findTotalSalay());
        System.out.println("Максимальная ставка у сотрудника: " + empBook.findMaxSalay().getFullName());
        System.out.println("Минимальная ставка у сотрудника: " + empBook.findMinSalay().getFullName());
        System.out.printf("Средняя ставка по больнице  = %.2f",empBook.findAvgSalay());
        empBook.listFullName();
    }
}