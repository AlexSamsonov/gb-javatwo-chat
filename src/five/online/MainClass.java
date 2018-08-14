package five.online;

public class MainClass {

    private static int a;
    private static int b;
    private static int c;
    private static int a1;
    private static int b1;
    private static int c1;

    static final Object monitor = new Object();

    static void incAllVars() {
        synchronized (monitor) {
            String vars;
            for (int i = 0; i < 1000000; i++) {
                a = a + 1;
                b = b + 1;
                c = c + 1;
            }
            vars = String.format("a = %d, b = %d, c = %d", a, b, c);
            System.out.println(vars);
        }
    }

    static Object mon2 = new Object();
    static void incAllVars2() {
        synchronized (mon2) {
            String vars;
            for (int i = 0; i < 1000000; i++) {
                a1 = a1 + 1;
                b1 = b1 + 1;
                c1 = c1 + 1;
            }
            vars = String.format("a = %d, b = %d, c = %d", a1, b1, c1);
            System.out.println(vars);
        }
    }

    public static void main(String[] args) {
        //incAllVars();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                incAllVars();
            }
        };
        new Thread(r, "Thread #1").start();
        new Thread(r, "Thread #2").start();
        new Thread(r, "Thread #3").start();
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                incAllVars2();
            }
        };
        new Thread(r2, "Thread #4").start();
        new Thread(r2, "Thread #5").start();
        new Thread(r2, "Thread #6").start();


        //basicThreading();
        //runnableThread();
        //interruptExample();
        //joinExample();

    }

    private static void joinExample() {
        MyThread t1 = new MyThread("Mt1", 3);
        MyThread t2 = new MyThread("Mt2", 5);
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main stopped");
    }

    private static void interruptExample() {
//        MyThread t = new MyThread("infinity");
        for (int i = 0; i < 50000; i++) {
            int b = i * 123;
        }
//        t.interrupt();
    }

    private static void runnableThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("Runnable");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    private static void basicThreading() {
//        MyThread myThread1 = new MyThread("My Thread 1");
//        MyThread myThread2 = new MyThread("My Thread 2");
//        MyThread myThread3 = new MyThread("My Thread 3");
//        MyThread myThread4 = new MyThread("My Thread 4");

        System.out.println("Main finished");
    }
}
