package two.online.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

    private static int div(int a, int b) throws ArithmeticException {
//        if (b == 0f)
//            throw new RuntimeException("div by 0");

        return a / b;
    }

    public static void main(String[] args) {
        //basicEx();

        TestStream ts = new TestStream();

        try {
            ts.open();
            ts.read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ts.close();
            } catch (IOException e) {
                throw new MyAwesomeException();
            }
        }

        try (TestStream tstr = new TestStream()) {
            tstr.open();
            tstr.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    private static void basicEx() {
        System.out.println("main started");
        try {
            System.out.println(div(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("You divided by zero! good for you!");
        }

        System.out.println("main ended");
    }

    /*
    * JVM
    *
    * in  console
    * out console
    *      ^
    *      |
    * err  \--------------------\
    *                            |
    *                            exception
    *                            |
    * main -> psvm() -> div() -> /0 x->
    *
    *
    * */
}
