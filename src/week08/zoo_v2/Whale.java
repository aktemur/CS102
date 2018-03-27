package week08.zoo_v2;

public class Whale extends Mammal implements Swimmer {
    public Whale(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Hi!";
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }
}
