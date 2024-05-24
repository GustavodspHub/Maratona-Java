package academy.devdojo.maratonajava.features;

import java.util.Scanner;

// O Scanner é uma classe em Java que faz parte do pacote java.util e é amplamente utilizada para ler a entrada do usuário a partir de várias fontes,
// como a entrada padrão (teclado), arquivos, strings, entre outras. A classe Scanner foi introduzida no Java 5 (JDK 1.5) e fornece métodos que permitem a
// leitura de dados primitivos (como inteiros, floats) e strings de maneira simples e eficiente.

public class Scanners {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your name");
        String name = input.nextLine();

        System.out.println("Type your age");
        int age = input.nextInt();

        System.out.println("Type your sex with M or F");
        char sex = input.next().charAt(0);

        System.out.println("\nHere is your data");
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);

        input.close();
    }
}
