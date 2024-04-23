package academy.devdojo.maratonajava.OOP.modificadorStatic.test;

import academy.devdojo.maratonajava.OOP.modificadorStatic.domain.StaticModifier;

public class TestStaticModifier {
    public static void main(String[] args) {
        StaticModifier staticModifier = new StaticModifier("BMW", 2024);
        StaticModifier staticModifierTwo = new StaticModifier("Mercedes", 2023);
        StaticModifier staticModifierThree = new StaticModifier("AUDI", 2022);

        StaticModifier.maximumSpeed = 250;
        staticModifier.print();
        staticModifierTwo.print();
        staticModifierThree.print();
    }
}
