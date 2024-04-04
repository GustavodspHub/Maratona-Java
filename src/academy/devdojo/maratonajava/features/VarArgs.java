package academy.devdojo.maratonajava.features;
// VarArgs

// VarArgs (Argumentos Variáveis) em Java é uma funcionalidade que permite que um método aceite um número variável de argumentos
// de um determinado tipo. Isso é útil quando você não sabe exatamente quantos argumentos serão passados para um método.
// Em Java, os VarArgs são denotados pelo uso de reticências (...) após o tipo do parâmetro na declaração do método.

public class VarArgs {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3)); // Saída: 6
        System.out.println(sum(5, 10, 15, 20)); // Saída: 50
        System.out.println(sum()); // Saída: 0 (nenhum argumento)
    }
}
