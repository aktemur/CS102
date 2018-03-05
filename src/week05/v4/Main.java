package week05.v4;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Serafettin", "gray");
        Dog dog = new Dog("Scooby", "golden");
        Cow cow = new Cow("Sari kiz", "yellow");
        Fish fish = new Fish("Nemo", "orange");

        System.out.println(cat);
        System.out.println(cat.speak());
        cat.move();
        System.out.println("---------------");

        System.out.println(dog);
        System.out.println(dog.speak());
        dog.move();
        System.out.println("---------------");

        System.out.println(cow);
        System.out.println(cow.speak());
        cow.move();
        System.out.println("---------------");

        System.out.println(fish);
        System.out.println(fish.speak());
        fish.move();
    }
}
