package week08.zoo_v2;

public class Levrek extends Fish {
    public Levrek(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Gulp";
    }
}
