package academy.devdojo.maratonajava.introducao;

public class Class04ConditionalStructures {
    public static void main(String[] args) {
        int age = 18;
        String category;
        boolean canHeBuyDrink = age >= 18;

        if(canHeBuyDrink) {
            System.out.println("He can buy drink");
        } else {
            System.out.println("He can not buy drink");
        }

        if(!canHeBuyDrink) {
            System.out.println("He can not buy drink");
        }

        String resultIfHeCanBuyDrink = age >= 18 ? "He can buy drink" : "He can not buy drink";
        System.out.println(resultIfHeCanBuyDrink);

        //
        if(age < 15) {
            category = "Category one";
        } else if(age >= 15 && age < 18) {
            category = "Category Two";
        } else {
            category = "Category Three";
        }

        category = age < 15 ? "Category one" : age >= 15 && age < 18 ? "Category Two" : "Category Three";

        System.out.println(category);
    }
}
