package week08.zoo_v1;

public class Levrek extends Fish {
    public Levrek(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Gulp";
    }
}
