package academy.devdojo.maratonajava.OOP.enumeracao.domain;

public class Person {
    public enum PersonCard {
        DEBIT_CARD,
        CREDIT_CARD
    }
    private String name;
    private final PersonTypeEnum personType;
    private final PersonCard personCard;

    public Person(String name, PersonTypeEnum personType, PersonCard personCard) {
        this.name = name;
        this.personType = personType;
        this.personCard = personCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personType=" + personType +
                ", personCard=" + personCard +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
