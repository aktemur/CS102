package week08.zoo_v2;

public class Dog extends Mammal {
    public Dog(String name, String color) {
        super(name, color);
    }

    public String makeSound() {
        return "Woof!";
    }
}
