package week05.v2;

public class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String speak() {
        return "Woof!";
    }

    public String toString() {
        return "Hi, my name is " + name + ". I'm " + color + ".";
    }
}
