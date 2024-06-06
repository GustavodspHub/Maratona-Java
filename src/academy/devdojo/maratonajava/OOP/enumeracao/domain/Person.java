package academy.devdojo.maratonajava.OOP.enumeracao.domain;

public class Person {
    private String name;
    private final PersonTypeEnum personType;

    public Person(String name, PersonTypeEnum personType) {
        this.name = name;
        this.personType = personType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personType=" + personType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
