package academy.devdojo.maratonajava.exercicios.exercise06Class;

public class TestCar {
    public static void main (String[] args) {
        Car carOne = new Car();

        carOne.model = "320i";
        carOne.name = "BMW";
        carOne.year = 2024;

        Car carTwo = new Car();

        carTwo.model = "AMG";
        carTwo.name = "Mercedes";
        carTwo.year = 2024;

        System.out.println(carTwo.model);
        System.out.println(carTwo.name);
        System.out.println(carTwo.year);

        System.out.println(carOne.model);
        System.out.println(carOne.name);
        System.out.println(carOne.year);

    }
}
