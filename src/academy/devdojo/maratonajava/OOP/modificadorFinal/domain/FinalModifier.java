package academy.devdojo.maratonajava.OOP.modificadorFinal.domain;

// O modificador final em Java é uma palavra-chave que pode ser aplicada a variáveis, métodos e classes. Sua função é evitar
// modificações após a definição inicial.

public class FinalModifier {
    public static final double FINAL_NUMBER = 250;

    public void print() {
        System.out.println(FinalModifier.FINAL_NUMBER);
    }
}
