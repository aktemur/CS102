package week08.zoo_v2;

public class Bat extends Mammal implements Flyer {
    public Bat(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "batbat";
    }

    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }
}
