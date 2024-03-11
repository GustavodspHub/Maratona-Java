package academy.devdojo.maratonajava.exercicios;
/*
    Utilizando switch e os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo
*/

public class Exercise03ConditionalStructures {
    public static void main(String[] args) {
        byte dayOfTheWeek = 2;
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Weekend");
                break;
            case 2:
                System.out.println("Week");
                break;
            case 3:
                System.out.println("Week");
                break;
            case 4:
                System.out.println("Week");
                break;
            case 5:
                System.out.println("Week");
                break;
            case 6:
                System.out.println("Week");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Day of the week invalid");
                break;
        }

        //----------------------------------------------------------------- *** ----------------------------------------

        switch (dayOfTheWeek) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Week");
                break;
            default:
                System.out.println("Day of the week invalid");
                break;
        }
    }
}
