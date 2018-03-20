package week07.zoo;

public class Cow extends Animal {
    public Cow(String name, String color) {
        super(name, color);
    }

    public String speak() {
        return "Mooo!";
    }
}
