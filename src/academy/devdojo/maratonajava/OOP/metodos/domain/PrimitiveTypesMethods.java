package academy.devdojo.maratonajava.OOP.metodos.domain;

// Em Java, os parâmetros do tipo primitivo são passados para métodos por valor. Isso significa que, quando um método é chamado
// e um argumento do tipo primitivo é passado, uma cópia do valor da variável é passada para o parâmetro do método. Qualquer alteração
// feita no parâmetro dentro do método não afeta a variável original que foi passada como argumento.

public class PrimitiveTypesMethods {
    public void changeNumbers(int numberOne, int numberTwo) {
        numberOne = 10;
        numberTwo = 20;
        System.out.println("Numbers of change Numbers");
        System.out.println(numberOne + " Number One");
        System.out.println(numberTwo + " Number Two");
    }
}
