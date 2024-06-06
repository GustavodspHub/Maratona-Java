package academy.devdojo.maratonajava.OOP.enumeracao.domain;

public enum PersonTypeEnum {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int personNumber;
    public final String personType;

    PersonTypeEnum(int personNumber, String personType) {
        this.personNumber = personNumber;
        this.personType = personType;
    }
}
