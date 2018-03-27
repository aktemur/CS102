package week08.zoo_v1;

public abstract class Bird extends Animal {
    public Bird(String name, String color) {
        super(name, color);
    }

    public void layEggs() {
        System.out.println(this.getName() + " is laying eggs.");
    }

    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }
}
