package ExceptionBox;

public class ThreadManageExceptionDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Caught it" + e);
        }
        System.out.println("Exiting main");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();
    }
}
