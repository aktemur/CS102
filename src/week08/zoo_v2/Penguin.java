package week08.zoo_v2;

public class Penguin extends Bird implements Swimmer {
    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Woooo";
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }
}
