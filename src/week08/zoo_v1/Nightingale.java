package week08.zoo_v1;

public class Nightingale extends Bird {
    public Nightingale(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "JeekJeek";
    }
}
