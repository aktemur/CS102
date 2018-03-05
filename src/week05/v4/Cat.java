package week05.v4;

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
}
