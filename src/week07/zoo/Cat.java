package week07.zoo;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat(String name) {
        this(name, "gray");
    }

    public String speak() {
        return "Miyauv!";
    }

    public void fallOn4Feet() {
        System.out.println("I'm lucky.");
    }
}
