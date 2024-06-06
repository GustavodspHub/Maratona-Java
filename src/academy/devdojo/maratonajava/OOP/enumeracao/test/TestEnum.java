package academy.devdojo.maratonajava.OOP.enumeracao.test;

import academy.devdojo.maratonajava.OOP.enumeracao.domain.Person;
import academy.devdojo.maratonajava.OOP.enumeracao.domain.PersonTypeEnum;

public class TestEnum {
    public static void main(String[] args) {
        Person personOne = new Person("Gustavo", PersonTypeEnum.PESSOA_FISICA);
        Person personTwo = new Person("Gustavo", PersonTypeEnum.PESSOA_JURIDICA);

        System.out.println(personOne);
        System.out.println(personTwo);
    }
}
