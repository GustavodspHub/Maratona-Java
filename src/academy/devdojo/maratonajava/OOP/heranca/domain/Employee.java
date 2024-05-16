package academy.devdojo.maratonajava.OOP.heranca.domain;

// A herança é um conceito fundamental na programação orientada a objetos (POO) em Java. Ela permite que uma classe herde propriedades e
// comportamentos de outra classe, promovendo a reutilização de código e a criação de uma hierarquia de classes que refletem relações do  mundo real.

// Conceitos Básicos
// Classe Base (Superclasse): É a classe da qual outras classes derivam. Também conhecida como classe pai ou classe mãe.
// Classe Derivada (Subclasse): É a classe que herda as propriedades e métodos da classe base. Também chamada de classe filha ou classe estendida.


public class Employee extends Person {
    private String salary;

    public void print() {

        // A palavra-chave super em Java é utilizada em contextos de herança para se referir diretamente à superclasse imediata de um objeto.
        // Ela oferece várias funcionalidades importantes que ajudam a gerenciar a herança de maneira eficiente.

        super.print();
        System.out.println(this.salary);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
