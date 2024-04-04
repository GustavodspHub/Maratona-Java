package academy.devdojo.maratonajava.OOP.metodos.test;

import academy.devdojo.maratonajava.OOP.metodos.domain.ThisKeyWord;

public class TestThisKeyWord {
    public static void main (String [] args) {
        ThisKeyWord testThisKeyWord = new ThisKeyWord();
        ThisKeyWord testThisKeyWordTwo = new ThisKeyWord();

        testThisKeyWord.name = "Gustavo";
        testThisKeyWordTwo.name = "Rodrigo";

        testThisKeyWord.printName();
        testThisKeyWordTwo.printName();
    }
}
