package academy.devdojo.maratonajava.OOP.enumeracao.domain;

public enum PersonTypeEnum {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int personNumber;
    public final String personType;

    public static PersonTypeEnum printPersonType(String personType) {
        for(PersonTypeEnum type: values()) {
            if(type.personType.equals(personType)) return type;
        }
        return null;
    }

    PersonTypeEnum(int personNumber, String personType) {
        this.personNumber = personNumber;
        this.personType = personType;
    }
}
