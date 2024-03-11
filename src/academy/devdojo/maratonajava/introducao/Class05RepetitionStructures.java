package academy.devdojo.maratonajava.introducao;

public class Class05RepetitionStructures {
    public static void main(String[] args) {
        // While, Do While, For
        byte count = 0;
        while (count < 10) {
            System.out.println("While "+ count);
            ++count;
        }
        count = 0;
// ------------------------------------------- ** ------------------------------
        do {
            System.out.println("Do " + count);
            ++count;
        } while (count < 10);
// ------------------------------------------- ** ------------------------------
        for (byte index = 0; index < 10; ++index) {
            System.out.println("For " + index);
        }
// ------------------------------------------- ** ------------------------------
        // Print only the first 25 numbers
        for (byte index = 0; index < 50; ++index) {
            if(index > 25) break;
            System.out.println(index);
        }
// ------------------------------------------- ** ------------------------------
        for(int installment = 30000; installment >= 1; installment--) {
            double installmentsValue = 30000 / installment;

            if(installmentsValue < 1000) continue;

            System.out.println("Parcelado em " + installment + "x por " + "R$" + installmentsValue);
        }
    }
}
