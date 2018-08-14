package one.online;

public class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("tweet");
    }

    void fly() {
        System.out.println("FLY!");
    }
}
