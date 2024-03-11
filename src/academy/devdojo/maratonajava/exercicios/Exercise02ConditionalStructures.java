package academy.devdojo.maratonajava.exercicios;
// I want to know how much I have to pay in the netherlands 2020 based on my annual salary

public class Exercise02ConditionalStructures {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double taxValue = 0;

        if (annualSalary <= 34712) {
            taxValue = annualSalary * firstTax;
        } else if (annualSalary > 34712 && annualSalary <= 68507) {
            taxValue = annualSalary * secondTax;
        } else if (annualSalary > 68507) {
            taxValue = annualSalary * thirdTax;
        } else {
            System.out.println("Your salary is invalid");
        }

        if(taxValue > 0) {
            System.out.println("You have to pay "+ taxValue + " of your salary");
        }

    }
}
