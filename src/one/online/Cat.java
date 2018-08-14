package one.online;

public class Cat extends Animal {
    int age;

    Cat(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("meow");
    }

    void doThings (String... commands) {
        for (int i = 0; i < commands.length; i++) {
            System.out.println(commands[i]);
        }
    }
}
