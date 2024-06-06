package academy.devdojo.maratonajava.OOP.enumeracao.test;

import academy.devdojo.maratonajava.OOP.enumeracao.domain.Person;
import academy.devdojo.maratonajava.OOP.enumeracao.domain.PersonCard;
import academy.devdojo.maratonajava.OOP.enumeracao.domain.PersonTypeEnum;

public class TestEnum {
    public static void main(String[] args) {
        Person personOne = new Person("Gustavo", PersonTypeEnum.PESSOA_FISICA, PersonCard.CREDIT_CARD);
        Person personTwo = new Person("Gustavo", PersonTypeEnum.PESSOA_JURIDICA, PersonCard.DEBIT_CARD);

        System.out.println(personOne);
        System.out.println(personTwo);
        System.out.println(PersonCard.DEBIT_CARD.discountCalculate(100));
        System.out.println(PersonCard.CREDIT_CARD.discountCalculate(100));
        System.out.println(PersonTypeEnum.printPersonType("Pessoa Fisica"));
        System.out.println(PersonTypeEnum.printPersonType("Pessoa Juridica"));
    }
}
