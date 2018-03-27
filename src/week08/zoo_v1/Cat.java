package week08.zoo_v1;

public class Cat extends Mammal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat(String name) {
        this(name, "gray");
    }

    public String makeSound() {
        return "Miyauv!";
    }

    public void fallOn4Feet() {
        System.out.println("I'm lucky.");
    }
}
