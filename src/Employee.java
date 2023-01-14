import java.util.Objects;

public class Employee {

    private String name;
    private String patronymic;
    private String lastName;
    private String fullName;
    private int dept;
    private float salary;
    private static long cnt = 1L;
    private final long id = cnt;

    public Employee(String name, String patronymic, String lastName, int dept, float salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.fullName = lastName + " " + name + " " + patronymic;
        this.dept = dept;
        this.salary = salary;
        cnt++;
    }


    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
        this.setFullName();
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        this.setFullName();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.setFullName();
    }

    public void setFullName() {
        this.fullName = this.lastName  + " " + this.name + " " + this.patronymic;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник id= " + id + " " + fullName + " из отдела " + dept + ". На ставке " + String.format("%.2f",salary) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
