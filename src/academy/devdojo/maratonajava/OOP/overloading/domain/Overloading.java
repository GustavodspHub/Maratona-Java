package academy.devdojo.maratonajava.OOP.overloading.domain;

// Em Java, a sobrecarga (overloading) refere-se à capacidade de uma classe ter múltiplos métodos com o mesmo nome,
// porém com diferentes listas de parâmetros. Isso permite que você defina várias versões de um método com funcionalidades semelhantes,
// mas com diferentes tipos de entrada ou número de parâmetros.

// A sobrecarga é especialmente útil quando você deseja fornecer interfaces mais flexíveis para os usuários de sua classe,
// permitindo que eles chamem métodos com diferentes tipos de argumentos, sem ter que se preocupar com a complexidade interna de decidir
// qual método chamar.

public class Overloading {

    // Método para somar dois inteiros
    public int sum(int a, int b) {
        return a + b;
    }

    // Método para somar três inteiros
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar dois números decimais
    public double sum(double a, double b) {
        return a + b;
    }
}
