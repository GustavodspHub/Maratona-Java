package academy.devdojo.maratonajava.exercicios;
/*
    Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado,
    sendo que o valor minimo da parcela é de 1000
*/

public class Exercise05RepetitionStructures {
    public static void main(String[] args) {
        double carValue = 50000;

        for(int installment = 1; installment <= carValue; installment++) {
            double installmentsValue = carValue / installment;

            if(installmentsValue < 1000) break;

            System.out.println("Parcelado em " + installment + "x por " + "R$" + installmentsValue);
        }
    }
}
