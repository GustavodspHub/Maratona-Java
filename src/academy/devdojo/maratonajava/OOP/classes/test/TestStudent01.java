package academy.devdojo.maratonajava.OOP.classes.test;

import academy.devdojo.maratonajava.OOP.classes.domain.Student;

public class TestStudent01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Gustavo";
        student.age = 21;
        student.sex = 'M';

        System.out.println(student);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
