package academy.devdojo.maratonajava.OOP.construtores.test;

import academy.devdojo.maratonajava.OOP.construtores.domain.Construct;

public class TestConstruct {
    public static void main(String[] args){
        Construct construct = new Construct("Gustavo", 21, 'M');

        System.out.println(construct.getAge());
        System.out.println(construct.getName());
        System.out.println(construct.getSex());
    }
}
