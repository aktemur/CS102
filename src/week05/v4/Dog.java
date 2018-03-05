package week05.v4;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public String speak() {
        return "Woof!";
    }
}
