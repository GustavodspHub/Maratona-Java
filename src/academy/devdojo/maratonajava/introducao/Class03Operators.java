package academy.devdojo.maratonajava.introducao;

public class Class03Operators {
    public static void main (String[] args) {
        /* Arithmetic operators */
        // + - / * %

        int number01 = 10;
        int number02 = 20;
        int number03 = 21;
        int result01 = number02 + number01;
        int result02 = number02 - number01;
        int result03 = number02 * number01;
        int result04 = number02 / number01;
        int result05 = number03 % number01;

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);
        System.out.println(result05);

        /* Relational Operators */
        // > < >= <= != ==

        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;

        System.out.println(isTenBiggerThanTwenty);
        System.out.println(isTenSmallerThanTwenty);
        System.out.println(isTenEqualThanTwenty);
        System.out.println(isTenDifferentThanTwenty);

        /* Logical Operators */
        // && (AND) || (OR) ! (Logical Not)

        int age = 29;
        float salary = 3500F;
        boolean isHeWithinTheBiggerThanThirtyLaw = age >= 30 && salary >= 4612;
        boolean isHeWithinSmallerThanThirtyLaw = age < 30 && salary >= 3381;

        System.out.println("Is he Within the bigger than thirty law? " + isHeWithinTheBiggerThanThirtyLaw);
        System.out.println("Is he Within the smaller than thirty law? " + isHeWithinSmallerThanThirtyLaw);

        int totalValue = 200;
        int totalValueTwo = 10000;
        int playstationValue = 5000;
        boolean canBuyThePlaystation = totalValue > playstationValue || totalValueTwo > playstationValue;
        System.out.println("Can we buy the playstation? " + canBuyThePlaystation);

        // = += -= *= /= %=
        int bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int index = 0;
        index += 1;
        index++;
        index--;
        ++index;
        --index;
        System.out.println(index);

    }
}
