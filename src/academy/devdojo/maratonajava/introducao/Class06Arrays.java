package academy.devdojo.maratonajava.introducao;

public class Class06Arrays {
    public static void main(String[] args) {
        // Arrays são do tipo reference
        // Arrays são considerados objetos na memória
        // Para Arrays e tipos primitivos inicializados fora de um escopo local, há uma inicialização padrão
        /*
            byte, short, int, long, float e double = 0
            char "\u0000' = ' '
            boolean = false
            Tipos References = null
        */
        int[] ages = new int[3];
        ages[0] = 19;
        ages[1] = 20;
        ages[2] = 21;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        // ------------------------------------------- ** ------------------------------

        String[] names = new String[3];
        names[0] = "Gustavo";
        names[1] = "Murilo";
        names[2] = "Millena";

        for(int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        // ------------------------------------------- ** ------------------------------

        int[] numbers01 = new int[5];
        int[] numbers02 = {1, 2, 3, 4, 5};
        int[] numbers03 = new int[]{1, 2, 3, 4, 5};

        for(int number : numbers03) {
            System.out.println(number);
        }
    }
}
