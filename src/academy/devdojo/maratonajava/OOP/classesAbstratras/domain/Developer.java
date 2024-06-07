package academy.devdojo.maratonajava.OOP.classesAbstratras.domain;

public class Developer extends Employee {
    private final String developerLevel;

    public Developer(String name, String position, double salary, String developerLevel) {
        super(name, position, salary);
        this.developerLevel = developerLevel;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developerLevel='" + developerLevel + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void bonusCalculate() {
        this.salary = salary + (salary * 0.5);
    }
}
