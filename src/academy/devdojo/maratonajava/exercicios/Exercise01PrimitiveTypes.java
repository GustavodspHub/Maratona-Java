package academy.devdojo.maratonajava.exercicios;

/*
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
*/

public class Exercise01PrimitiveTypes {
    public static void main(String[] args) {
        String name = "Gustavo Pereira";
        String address = "São paulo";
        float salary = 5000.00F;
        String receiveSalaryDate = "28/02/2024";

        System.out.println("Eu " + name + " morando no endereço " + address + ", confirmo que recebi o salário de " + salary + ", na data " + receiveSalaryDate);
    }
}
