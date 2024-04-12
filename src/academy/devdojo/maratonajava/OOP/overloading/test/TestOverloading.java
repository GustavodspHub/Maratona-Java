package academy.devdojo.maratonajava.OOP.overloading.test;

import academy.devdojo.maratonajava.OOP.overloading.domain.Overloading;

public class TestOverloading {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        int sumTwoIntegersNumbers = overloading.sum(1, 1);
        int sumThreeIntegersNumbers = overloading.sum(1, 1, 1);
        double sumTwoDecimalsNumbers = overloading.sum(1.3, 1.3);
        System.out.println(sumTwoIntegersNumbers);
        System.out.println(sumThreeIntegersNumbers);
        System.out.println(sumTwoDecimalsNumbers);

    }
}

