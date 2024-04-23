package academy.devdojo.maratonajava.OOP.modificadorStatic.domain;

// Em Java, a palavra-chave static é utilizada para criar membros de classe que pertencem à classe em si, e não a instâncias individuais da classe.
// Isso significa que os membros estáticos são compartilhados por todas as instâncias da classe e podem ser acessados diretamente através do nome da classe,
// sem a necessidade de criar um objeto da classe.

public class StaticModifier {
    private String model;
    private int year;
    public static int maximumSpeed;

    public StaticModifier(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void print() {
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(StaticModifier.maximumSpeed);
        System.out.println("----------------------------------------");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
