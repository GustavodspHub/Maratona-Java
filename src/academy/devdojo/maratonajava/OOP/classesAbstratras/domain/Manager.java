package academy.devdojo.maratonajava.OOP.classesAbstratras.domain;

public class Manager extends Employee{
    public Manager(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public void bonusCalculate() {
        this.salary = salary + (salary * 0.9);
    }
}
