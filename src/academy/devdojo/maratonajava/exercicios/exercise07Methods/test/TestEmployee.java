package academy.devdojo.maratonajava.exercicios.exercise07Methods.test;

import academy.devdojo.maratonajava.exercicios.exercise07Methods.domain.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Gustavo";
        employee.age = 21;

        employee.printData();
        double salaryAverage = employee.salaryAverage();
        System.out.println("\nSalary average: " + salaryAverage);
    }
}
