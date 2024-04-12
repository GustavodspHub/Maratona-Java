package academy.devdojo.maratonajava.OOP.metodos.domain;

// Quando um membro de uma classe é declarado como private, ele só pode ser acessado dentro da própria classe.
// Isso significa que outros objetos ou classes não podem acessar diretamente esse membro.

// Usar getters e setters oferece diversos benefícios:

// Encapsulamento: Os detalhes da implementação da classe são ocultados, facilitando a manutenção e reduzindo o acoplamento com outras
// partes do código.

// Controle de Acesso: Os getters e setters permitem que a classe controle como seus dados são acessados e modificados. Por exemplo,
// a classe pode validar os valores antes de aceitá-los.

// Flexibilidade: Se a implementação interna da classe mudar, isso pode ser feito sem afetar o código cliente, desde que os
// getters e setters permaneçam consistentes.

public class PrivateSetGet {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
