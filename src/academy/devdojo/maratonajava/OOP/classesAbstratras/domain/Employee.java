package academy.devdojo.maratonajava.OOP.classesAbstratras.domain;


public abstract class Employee extends Person {
    protected String name;
    protected String position;
    protected double salary;


    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        bonusCalculate();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public abstract void bonusCalculate();

    public void print(){
        System.out.println("Printing...");
    }
}
