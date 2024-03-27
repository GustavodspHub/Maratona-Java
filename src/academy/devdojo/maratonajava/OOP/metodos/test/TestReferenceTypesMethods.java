package academy.devdojo.maratonajava.OOP.metodos.test;

import academy.devdojo.maratonajava.OOP.metodos.domain.ReferenceTypesMethods;
import academy.devdojo.maratonajava.OOP.metodos.domain.Student;

public class TestReferenceTypesMethods {
    public static void main(String[] args) {
        Student student = new Student();
        ReferenceTypesMethods referenceTypesMethods = new ReferenceTypesMethods();

        student.name = "Millena";
        student.age = 20;
        student.sex = 'F';

        System.out.println("First time");
        referenceTypesMethods.studentPrint(student);

        System.out.println("Second time after the method change the object");
        referenceTypesMethods.studentPrint(student);
    }
}
