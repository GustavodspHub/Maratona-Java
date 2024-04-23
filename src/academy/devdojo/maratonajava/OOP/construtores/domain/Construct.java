package academy.devdojo.maratonajava.OOP.construtores.domain;

// Em Java, um construtor é um método especial que é chamado quando um objeto de uma classe é criado. Ele tem o mesmo nome que a classe
// e não possui um tipo de retorno explicitamente declarado. Os construtores são usados para inicializar o estado de um objeto,
// configurando seus atributos e executando outras operações necessárias antes que o objeto esteja pronto para ser utilizado.

// Inicialização de objetos: Os construtores são usados para inicializar os valores dos atributos de um objeto quando ele é instanciado.

// Nome do método: O nome do construtor deve ser o mesmo que o nome da classe em que está definido.

// Não possui tipo de retorno: Ao contrário de outros métodos em Java, os construtores não têm um tipo de retorno especificado na
// declaração.

// Sobrecarga de construtores: Assim como outros métodos, os construtores também podem ser sobrecarregados, o que significa que
// você pode ter vários construtores com diferentes listas de parâmetros.

// Padrão de Construtor: Se você não definir nenhum construtor explicitamente em sua classe, o Java fornecerá automaticamente um
// construtor padrão sem parâmetros. Esse construtor padrão inicializa os valores padrão para os atributos do objeto
// (zero para tipos numéricos, false para booleanos e null para objetos).

// Uso de construtores em cadeia (chained constructors): Em Java, é possível chamar um construtor de dentro de outro construtor da
// mesma classe usando a palavra-chave this(). Isso é útil quando você tem várias sobrecargas de construtores e deseja evitar duplicação
// de código.

// Acesso: A visibilidade de um construtor (ou seja, se ele pode ser acessado por outras classes) depende do modificador de acesso que você
// atribui a ele. Os construtores podem ser public, private, protected ou default (quando nenhum modificador é especificado).

// Não são herdados: Os construtores não são herdados pelas subclasses. No entanto, a primeira linha de um construtor de uma subclasse deve
// chamar explicitamente um construtor da classe pai usando super().

// Os construtores são uma parte fundamental da linguagem Java e são usados extensivamente para inicializar objetos e garantir que eles
// estejam em um estado válido antes de serem utilizados em um programa.

public class Construct {
    private final String name;
    private final int age;
    private char sex;

    public Construct(String name, int age) {
        this.age = age;
        this.name = name;
    }

    // Overloading
    public Construct(String name, int age, char sex) {
        this(name, age);
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return sex;
    }
}
