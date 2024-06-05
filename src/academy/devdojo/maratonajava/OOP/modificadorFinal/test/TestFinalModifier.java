package academy.devdojo.maratonajava.OOP.modificadorFinal.test;

import academy.devdojo.maratonajava.OOP.modificadorFinal.domain.FinalModifier;

public class TestFinalModifier {
    public static void main(String [] args) {
        FinalModifier finalModifier = new FinalModifier();
        System.out.println(FinalModifier.FINAL_NUMBER);
        finalModifier.print();
    }
}
