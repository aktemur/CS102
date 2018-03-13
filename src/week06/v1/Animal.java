package week06.v1;

// If you do not specify a parent class, the class
// will extend the Object class; as if like you'd written
//   public class Animal extends Object { ... }
//
// Object is the root of the class hierarchy in Java.
public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void move() {
        System.out.println("Put front-left leg forward.");
        System.out.println("Put back-right leg forward.");
        System.out.println("Put front-right leg forward.");
        System.out.println("Put back-left leg forward.");
    }

    public String toString() {
        return "Hi, my name is " + name + ". I'm " + color + ".";
    }
}
