package academy.devdojo.maratonajava.OOP.classesAbstratras.test;

import academy.devdojo.maratonajava.OOP.classesAbstratras.domain.Developer;
import academy.devdojo.maratonajava.OOP.classesAbstratras.domain.Manager;

public class TestAbstractClass {
    public static void main(String[] args) {
        Developer developer = new Developer("Gustavo", "Software Engineer - Payments", 5000, "Mid-level");
        Manager manager = new Manager("Leandro", "Software Engineer Manager", 10000);

        System.out.println(developer);
        System.out.println(manager);
    }
}
