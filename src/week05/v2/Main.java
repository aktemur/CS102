package week05.v2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Serafettin", "gray");
        Dog dog = new Dog("Scooby", "golden");
        Cow cow = new Cow("Sari kiz", "yellow");

        System.out.println(cat);
        System.out.println(cat.speak());
        System.out.println(dog);
        System.out.println(dog.speak());
        System.out.println(cow);
        System.out.println(cow.speak());
    }
}
