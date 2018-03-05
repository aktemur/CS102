package week05.v1;

public class Animal {
    private String name;
    private String color;
    private String type;
    private String dogType;

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

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String speak() {
        if (type.equals("dog")) {
            if (dogType.equals("kangal")) {
                return "Loud Woof!";
            } else if (dogType.equals("chow")){
                return "Cute Woof!";
            } else {
                return "Woof!";
            }
        } else if (type.equals("cat")) {
            return "Miyauv!";
        } else if (type.equals("cow")) {
            return "Mooo!";
        } else {
            return "Some noise.";
        }
    }
}
