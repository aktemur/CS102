package week05.v1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Serafettin", "gray", "cat");
        Animal dog = new Animal("Scooby", "golden", "dog");
        dog.setDogType("kangal");
        Animal cow = new Animal("Sari kiz", "yellow", "cow");

        System.out.println(cat.speak());
        System.out.println(dog.speak());
        System.out.println(cow.speak());
    }
}
