package one.online;

public class MainClass {
    public static void main(String[] args) {
        Cat c = new Cat("Barsik");
        Bird b = new Bird("Chijik");

        Animal[] arr = {c, b};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Bird)
                ((Bird) arr[i]).fly();
        }
        c.age = 10;
        Bird b1 = (Bird) arr[0];


        c.doThings("лежать", "голос");

    }
}
