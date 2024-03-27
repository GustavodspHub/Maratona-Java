package academy.devdojo.maratonajava.exercicios;

// Imprima todos os números pares de 0 até 1000000

public class Exercise04RepetitionStructures {
    public static void main(String[] args) {
        for(int index = 0; index <= 1000000; ++index) {
            if(index % 2 == 0) System.out.println(index);
        }
    }
}
