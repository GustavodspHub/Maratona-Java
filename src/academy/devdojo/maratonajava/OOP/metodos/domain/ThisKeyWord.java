package academy.devdojo.maratonajava.OOP.metodos.domain;

// Em Java, a palavra-chave this é uma referência especial que pode ser usada dentro de métodos ou construtores para se referir ao objeto
// atual da classe em que está sendo usado

public class ThisKeyWord {
    public String name;

    public void printName () {
        System.out.println("----------------------------");
        System.out.println(this.name);
    }
}
