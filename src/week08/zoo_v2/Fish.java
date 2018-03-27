package week08.zoo_v2;

public abstract class Fish extends Animal implements Swimmer {
    public Fish(String name, String color) {
        super(name, color);
    }

    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }
}
