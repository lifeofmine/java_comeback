package ThreadBox;

class RunnableTest implements Runnable {
    private Thread t;
    private String threadName;

    RunnableTest(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4;i > 0;i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        RunnableTest R1 = new RunnableTest("Thread-1");
        R1.start();
        RunnableTest R2 = new RunnableTest("Thread-2");
        R2.start();
    }
}
