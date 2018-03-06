package week05.v5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Serafettin", "gray");
        Dog dog = new Dog("Scooby", "golden");
        Cow cow = new Cow("Sari kiz", "yellow");
        Fish fish = new Fish("Nemo", "orange");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cow);
        animals.add(fish);

        // Here, we treat each animal uniformly using the Animal type.
        // In iteration 0, "animal" points to a Cat object
        // In iteration 1, "animal" points to a Dog object
        // In iteration 2, "animal" points to a Cow object
        // In iteration 3, "animal" points to a Fish object
        // That is, in each iteration, "animal" takes a different
        // shape. This is called Polymorphism.
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            System.out.println(animal);
            animal.move();
            System.out.println("---------------");
        }

        System.out.println("===============================");

        // You can write the loop above using an enhanced for-loop:
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.move();
            System.out.println("---------------");
        }
    }
}
