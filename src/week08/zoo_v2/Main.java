package week08.zoo_v2;

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
        zoo.add(new Bat("Batman", "black"));
        zoo.add(new Penguin("Imparator", "black&white"));
        zoo.add(new Whale("Aydin", "white"));

        // Display all the animals.
        // Meanwhile, make all the swimmers swim,
        // the flyers fly, the mammals give birth, and the egg layers lay eggs.
        for (Animal animal : zoo) {
            System.out.println(animal);
            System.out.println(animal.makeSound());
            if (animal instanceof Swimmer) {
                ((Swimmer)animal).swim();
            }
            if (animal instanceof Flyer) {
                ((Flyer)animal).fly();
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
