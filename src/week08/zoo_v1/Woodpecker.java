package week08.zoo_v1;

public class Woodpecker extends Bird {
    public Woodpecker(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "TockTock";
    }
}
