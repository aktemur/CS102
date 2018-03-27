package week08.zoo_v1;

public abstract class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color);
    }

    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }
}
