package week07.zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Serafettin", "gray");
        Dog dog = new Dog("Scooby", "golden");
        Cow cow = new Cow("Sari kiz", "yellow");
        Fish fish = new Fish("Nemo", "orange");

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(cow);
        zoo.add(fish);

        for (Animal animal : zoo) {
            System.out.println(animal);
            animal.move();
            System.out.println(animal.speak());
            System.out.println("-----------------------");
        }

    }
}
