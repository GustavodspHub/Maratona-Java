package academy.devdojo.maratonajava.features;

import java.util.Scanner;

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
    }
}
