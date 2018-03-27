package week08.zoo_v2;

public class Woodpecker extends FlyerBird {
    public Woodpecker(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "TockTock";
    }
}
