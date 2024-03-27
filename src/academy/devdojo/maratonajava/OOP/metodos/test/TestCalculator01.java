package academy.devdojo.maratonajava.OOP.metodos.test;

import academy.devdojo.maratonajava.OOP.metodos.domain.Calculator;

public class TestCalculator01 {
    public static void main (String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumNumbers();
        calculator.subtractNumbers(10, 10);

        double divisionNumber = calculator.divisionNumbers(10, 10);
        System.out.println(divisionNumber);
    }
}
