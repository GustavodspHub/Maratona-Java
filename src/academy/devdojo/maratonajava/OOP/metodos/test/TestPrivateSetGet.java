package academy.devdojo.maratonajava.OOP.metodos.test;

import academy.devdojo.maratonajava.OOP.metodos.domain.PrivateSetGet;

public class TestPrivateSetGet {
    public static void main(String[] args) {
        PrivateSetGet privateSetGet = new PrivateSetGet();
        privateSetGet.setName("Gustavo");
        privateSetGet.setAge(21);
        System.out.println(privateSetGet.getAge());
        System.out.println(privateSetGet.getName());
    }
}
