package ThreadsBox;

public class SleepingThreadDemo extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;
    public SleepingThreadDemo() {
        super("" + ++threadCount);
        start();
    }
    public String toString() {
        return "#" + getName() + ": " + countDown;
    }
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new SleepingThreadDemo().join();
        }
        System.out.println("线程已被挂起");
    }
}
