package one.online;

public abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }

    abstract void voice();
}
