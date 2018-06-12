package ThreadsBox;

public class IsAliveThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }

    public static void main(String[] args) {
        IsAliveThreadDemo it = new IsAliveThreadDemo();
        it.setName("Thread");
        System.out.println("before start(), it.isAlive()=" + it.isAlive());
        it.start();
        System.out.println("just after start(), it.isAlive()=" + it.isAlive());
        for (int i = 0; i < 10; i++) {
            it.printMsg();
        }
        System.out.println("The end of main(), it.isAlive()=" + it.isAlive());
    }
}
