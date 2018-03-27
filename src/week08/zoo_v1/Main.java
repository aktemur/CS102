package week08.zoo_v1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Cat("Felix", "orange"));
        zoo.add(new Dog("Findik", "white"));
        zoo.add(new Hamsi("Taka", "gray"));
        zoo.add(new Levrek("Levy", "silver"));
        zoo.add(new Nightingale("Bulbul", "yellow"));
        zoo.add(new Woodpecker("Woody", "red"));


        // Display all the animals.
        // Meanwhile, make all the swimmers swim,
        // the flyers fly, the mammals give birth, and the egg layers lay eggs.
        for (Animal animal : zoo) {
            System.out.println(animal);
            System.out.println(animal.makeSound());
            if (animal instanceof Fish) {
                ((Fish)animal).swim();
            }
            if (animal instanceof Bird) {
                ((Bird)animal).fly();
            }
            if (animal instanceof Bird) {
                ((Bird)animal).layEggs();
            }
            if (animal instanceof Mammal) {
                ((Mammal)animal).giveBirth();
            }
            System.out.println("-----------------------");
        }

    }
}
