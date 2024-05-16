package academy.devdojo.maratonajava.OOP.heranca.domain;

public class Address {
    public String city;
    public String cep;

    public Address(String city, String cep) {
        this.city = city;
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
