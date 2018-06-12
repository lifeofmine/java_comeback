package ThreadsBox;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class UnLockTestDemo {
    public static String obj1 = "obj1";
    public static final Semaphore a1 = new Semaphore(1);
    public static String obj2 = "obj2";
    public static final Semaphore a2 = new Semaphore(1);

    public static void main(String[] args) {
        LockAa la = new LockAa();
        new Thread(la).start();
        LockBb lb = new LockBb();
        new Thread(lb).start();
    }
}
class LockAa implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                if (UnLockTestDemo.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockA 锁住 obj1");
                    if (UnLockTestDemo.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj2");
                        Thread.sleep(60 * 1000);
                    } else {
                        System.out.println(new Date().toString() + "LockA 锁住 obj1 失败");
                    }
                    UnLockTestDemo.a1.release();
                    UnLockTestDemo.a2.release();
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class LockBb implements Runnable {
    public void run() {
        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                if (UnLockTestDemo.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockB 锁住 obj2");
                    if (UnLockTestDemo.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockB 锁住 obj1");
                        Thread.sleep(60 * 1000);
                    } else {
                        System.out.println(new Date().toString() + "LockB 锁 obj1 失败");
                    }
                } else {
                    System.out.println(new Date().toString() + "LockB 锁 obj2 失败");
                }
                UnLockTestDemo.a1.release();
                UnLockTestDemo.a2.release();
                Thread.sleep(10 * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
