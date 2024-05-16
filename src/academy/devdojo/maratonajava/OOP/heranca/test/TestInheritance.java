package academy.devdojo.maratonajava.OOP.heranca.test;

import academy.devdojo.maratonajava.OOP.heranca.domain.Address;
import academy.devdojo.maratonajava.OOP.heranca.domain.Employee;

public class TestInheritance {
    public static void main(String[] args) {
        Address address = new Address("São Paulo", "432432432");
        Employee employee = new Employee();

        employee.setSalary("15000");
        employee.setName("Gustavo");
        employee.setCpf("12345678912");
        employee.setAddress(address);

        System.out.println(employee.getSalary());
        System.out.println(employee.getCpf());
        System.out.println(employee.getName());
    }
}
