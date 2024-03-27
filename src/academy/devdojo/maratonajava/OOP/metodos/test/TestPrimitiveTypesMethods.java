package academy.devdojo.maratonajava.OOP.metodos.test;


import academy.devdojo.maratonajava.OOP.metodos.domain.PrimitiveTypesMethods;

public class TestPrimitiveTypesMethods {
    public static void main(String[] args) {
        PrimitiveTypesMethods primitiveTypesMethods = new PrimitiveTypesMethods();

        int numberOne = 1;
        int numberTwo = 2;

        System.out.println("Test Primitive Types Method");
        System.out.println(numberOne + " Number One");
        System.out.println(numberTwo + " Number Two");

        primitiveTypesMethods.changeNumbers(numberOne, numberTwo);

        System.out.println("Test Primitive Types Method Again");
        System.out.println(numberOne + " Number One");
        System.out.println(numberTwo + " Number Two");
    }
}
