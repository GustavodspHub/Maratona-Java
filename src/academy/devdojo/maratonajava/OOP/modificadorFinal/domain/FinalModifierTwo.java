package academy.devdojo.maratonajava.OOP.modificadorFinal.domain;

public class FinalModifierTwo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Um método declarado com "Final" não pode ser sobrescrito.
    public final void print() {
        System.out.println(FinalModifier.FINAL_NUMBER);
    }

}
