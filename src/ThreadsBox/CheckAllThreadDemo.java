package ThreadsBox;

public class CheckAllThreadDemo extends Thread {
    public static void main(String[] args) {
        CheckAllThreadDemo t1 = new CheckAllThreadDemo();
        t1.setName("thread1");
        t1.start();
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++)
            System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
    }
}
