package academy.devdojo.maratonajava.OOP.modificadorFinal.domain;

// O modificador final em Java é uma palavra-chave que pode ser aplicada a variáveis, métodos e classes. Sua função é evitar
// modificações após a definição inicial.

// O modificador final em classe, impede que ela seja estendida, evitando qualquer alteração na classe.
public final class FinalModifier {
    public static final double FINAL_NUMBER = 250;
    public final FinalModifierTwo finalTwo = new FinalModifierTwo();

    public void print() {
        System.out.println(FinalModifier.FINAL_NUMBER);
    }
}
