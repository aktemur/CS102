package week07.zoo;

public class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color);
    }

    // This method overrides the 'move' method of the parent class
    public void move() {
        System.out.println("Wiggle flippers.");
        System.out.println("Wiggle tail.");
    }

    public String speak() {
        return "Gulp!";
    }
}
