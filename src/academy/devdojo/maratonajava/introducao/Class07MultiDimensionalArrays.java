package academy.devdojo.maratonajava.introducao;

public class Class07MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;

        for(int index = 0; index < numbers.length; index++) {
            System.out.println("Estou na base, no array " + index);
            for(int indexTwo = 0; indexTwo < numbers[index].length; indexTwo++) {
                System.out.println(numbers[index][indexTwo]);
            }
        }

        // ------------------------------------------- ** ------------------------------

        for(int[] array : numbers) {
            for(int number : array) {
                System.out.println(number);
            }
        }

        // ------------------------------------------- ** ------------------------------

        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayIntTwo = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
    }
}
