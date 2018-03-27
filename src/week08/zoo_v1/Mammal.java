package week08.zoo_v1;

public abstract class Mammal extends Animal {
    public Mammal(String name, String color) {
        super(name, color);
    }

    public void giveBirth() {
        System.out.println(this.getName() + " is giving birth.");
    }
}
