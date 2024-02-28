package academy.devdojo.maratonajava.introducao;

public class Class02PrimitiveTypesPt01 {
    public static void main(String[] args) {
        /* Primitive Types
         Em Java, tipos primitivos são os tipos de dados básicos que representam valores simples

         int, double, float, char, byte, short, long, boolean
        */

        int age = 20;
        long longNumber = 100000;
        double doubleNumber = 10000.0;
        float floatNumber = 10000.0F;
        byte byteNumber = -128;
        short shortNumber = 10;
        boolean isTrue = true;
        boolean isFalse = false;
        char men = 'M';

        /*  Casting
            Em Java, Casting é quando você força uma variável do tipo x a aceitar um valor do tipo y. Por exemplo:
        */

                int ageTwo = (int) 10.00F;

        /*
            No exemplo acima, é atribuído um valor do tipo Float para uma variável do tipo Int.
            Caso você passe um valor que exceda o limite de bytes do tipo, será aceito, porém, ao utilizar
            o valor, o Java fará a conversão, podendo resultar em perda de precisão, truncando o valor para que ele
            se ajuste ao tipo da variável.
        */

        System.out.println("My age is " + age + " year old");
    }
}
