package academy.devdojo.maratonajava.exercicios.exercise07Methods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        if(this.salary == null) return;

        for(double salary : this.salary) {
            System.out.print("Salary: " + salary + " ");
        }
    }

    public double salaryAverage() {
        double sum = 0f;
        if(this.salary == null) return 0;

        for(double salary : this.salary) {
            sum += salary;

        }
        return sum / this.salary.length;
    }
}
