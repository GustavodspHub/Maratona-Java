package academy.devdojo.maratonajava.OOP.metodos.domain;

// Quando os parâmetros de um método em Java são do tipo de referência (também conhecidos como objetos), a situação é um pouco diferente
// em comparação com os parâmetros do tipo primitivo. Em vez de passar uma cópia do valor da referência, uma cópia da referência é passada
// para o método. Isso significa que ambas as referências (a original e a passada como argumento) apontam para o mesmo objeto na memória.
// Como resultado, qualquer alteração feita no objeto dentro do método afetará o objeto original.

public class ReferenceTypesMethods {
    public void studentPrint (Student student) {
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        student.name = "Gustavo";
        student.age = 21;
        student.sex = 'M';
    }
}
