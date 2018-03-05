package week05.v0;

public class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String speak() {
        if (type.equals("dog")) {
            return "Woof!";
        } else if (type.equals("cat")) {
            return "Miyauv!";
        } else if (type.equals("cow")) {
            return "Mooo!";
        } else {
            return "Some noise.";
        }
    }
}
