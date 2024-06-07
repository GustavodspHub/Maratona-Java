package academy.devdojo.maratonajava.OOP.classesAbstratras.domain;

public abstract class Employee {
    protected final String name;
    protected final String position;
    protected final double salary;


    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
