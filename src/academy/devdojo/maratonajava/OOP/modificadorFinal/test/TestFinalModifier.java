package academy.devdojo.maratonajava.OOP.modificadorFinal.test;

import academy.devdojo.maratonajava.OOP.modificadorFinal.domain.FinalModifier;
import academy.devdojo.maratonajava.OOP.modificadorFinal.domain.FinalModifierTwo;

public class TestFinalModifier {
    public static void main(String [] args) {
        FinalModifier finalModifier = new FinalModifier();
        System.out.println(FinalModifier.FINAL_NUMBER);
        finalModifier.print();

        // Quando a propriedade / variável é do tipo reference e tem o modificador "Final", indica que a referência não deve ser alterada.

        // ERROR
        // FinalModifierTwo finalModifierTwo = new FinalModifierTwo();
        // finalModifier.finalTwo =  finalModifierTwo;

        finalModifier.finalTwo.setName("Gustavo");
        System.out.println(finalModifier.finalTwo.getName());
    }
}
