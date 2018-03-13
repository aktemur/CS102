package week06.v1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Serafettin", "gray");
        Dog dog = new Dog("Scooby", "golden");
        Cow cow = new Cow("Sari kiz", "yellow");
        Fish fish = new Fish("Nemo", "orange");

        Animal animal;
        if (Math.random() < 0.5) {
            animal = cat;
        } else {
            animal = dog;
        }
        // 'animal' variable may point to a Cat object or a Dog.
        // This is determined at runtime.
        // There is no way for the compiler to know exactly
        // whether the variable will point to a Cat or Dog.
        // We can do things general to all Animals. E.g.
        animal.move();
        System.out.println(animal);

        if (animal instanceof Dog) {
            System.out.println("It's a Dog!!!");
        } else if (animal instanceof Cat) {
            System.out.println("It's a Cat!!!");
            Cat c = (Cat)animal; // Casting
            c.fallOn4Feet();
        }

        // The cast below will crash at runtime
        // if animal does not point to a Cat.
        Cat felix = (Cat)animal;
        felix.fallOn4Feet();
    }
}
