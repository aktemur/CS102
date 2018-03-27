package week08.zoo_v2;

public class Nightingale extends FlyerBird {
    public Nightingale(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "JeekJeek";
    }
}
