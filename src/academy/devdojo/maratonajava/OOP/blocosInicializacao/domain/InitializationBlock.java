package academy.devdojo.maratonajava.OOP.blocosInicializacao.domain;

// Em Java, os blocos de inicialização são usados para executar código antes da inicialização de um objeto. Existem dois tipos de blocos de inicialização em Java: blocos de
// inicialização estáticos e blocos de inicialização de instância.

// Blocos de Inicialização Estáticos:
// Estes blocos são executados apenas uma vez quando a classe é carregada na memória pela primeira vez.
// Eles são usados principalmente para inicializar variáveis estáticas da classe.
// A sintaxe para um bloco de inicialização estático é simplesmente colocar o código entre chaves dentro de uma classe precedido pela palavra-chave static.

// Blocos de Inicialização de Instância:
// Estes blocos são executados cada vez que um objeto da classe é instanciado.
// Eles são usados para inicializar variáveis de instância, especialmente quando a inicialização requer lógica mais complexa.
// A sintaxe para um bloco de inicialização de instância é similar à dos blocos estáticos, mas sem a palavra-chave static.
public class InitializationBlock {
     static int staticVariable;
     int nonStaticVariable;

    static {
        System.out.println("Static Initialization");
        staticVariable = 10;
    }

    {
        System.out.println("Instance Initialization");
        nonStaticVariable = 20;
    }
}
