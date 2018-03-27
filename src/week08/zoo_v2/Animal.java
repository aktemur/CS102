package week08.zoo_v2;

// Note that this is an ABSTRACT class
public abstract class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract String makeSound();

    public String toString() {
        return "Hi, my name is " + name + ". I'm " + color + ".";
    }
}
