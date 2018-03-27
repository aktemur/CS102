package week08.zoo_v2;

public abstract class FlyerBird extends Bird implements Flyer {
    public FlyerBird(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }
}
