package five.online;

public class MyThread extends Thread {

    int delay;

    public MyThread(String name, int delay) {
        super(name);
        this.delay = delay;
        start();
    }

    @Override
    public void run() {
        //interruptExample();
        try {
            sleep(delay * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " stopped");
    }

    private void interruptExample() {
        while(!isInterrupted()) {
            System.out.println("printing...");
        }
        System.out.println("thread terminated");
        //closed thread
    }
}
