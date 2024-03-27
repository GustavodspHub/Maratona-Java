package academy.devdojo.maratonajava.OOP.metodos.domain;

// Em programação orientada a objetos (OOP), os métodos são blocos de código que são projetados para realizar uma tarefa específica ou
// fornecer um comportamento específico para um objeto. Eles são essenciais para a OOP, pois encapsulam a lógica e o comportamento de
// um objeto, permitindo que ele execute ações e interaja com outros objetos.

public class Calculator {
    public void sumNumbers() {
        System.out.println(10 + 10);
    }

    // Os parâmetros de um método são variáveis que você pode passar para o método quando o invoca.
    // Eles fornecem uma maneira de enviar dados para o método, que o método pode então usar em sua lógica para executar uma determinada
    // tarefa.

    public void subtractNumbers(int numberOne, int numberTwo) {
        System.out.println(numberOne - numberTwo);
    }

    // Em Java, o retorno de métodos refere-se ao valor que um método devolve após sua execução. Esse valor pode ser de qualquer tipo de dado,
    // incluindo tipos primitivos (como int, double, boolean, etc.), tipos de objeto (como String, ArrayList, etc.), ou até mesmo o tipo void,
    // que indica que o método não retorna nenhum valor.

    public double divisionNumbers(double numberOne, double numberTwo) {
        if(numberTwo == 0) return 0;

        return numberOne / numberTwo;
    }
}
