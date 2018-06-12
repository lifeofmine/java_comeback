package ThreadsBox;

public class ThreadInterruptDemo extends Thread {
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
        Thread thread = new ThreadInterruptDemo();
        thread.start();
        System.out.println("在50秒之内按任意键中断线程！");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出！");
    }
}
