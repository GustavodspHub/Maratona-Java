package academy.devdojo.maratonajava.OOP.heranca.domain;

public class Employee extends Person {
    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
