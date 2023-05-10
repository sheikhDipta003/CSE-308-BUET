package Observer_pattern.Multithreading_democodes;

class TestThreadGroup implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running...");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Runnable task in " + Thread.currentThread().getName() + " interrupted");
        }
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) {
        TestThreadGroup runnableObj = new TestThreadGroup();
        ThreadGroup tg = new ThreadGroup("Root-ThreadGroup");
        Thread t1 = new Thread(tg, runnableObj, "<1>");
        Thread t2 = new Thread(tg, runnableObj, "<2>");
        Thread t3 = new Thread(tg, runnableObj, "<3>");

        System.out.println("ThreadGroup name: " + tg.getName());
        t1.start();
//        Thread.currentThread().getThreadGroup().interrupt();        //interrupt currently executing ThreadGroup
        // checking the number of active thread by invoking the activeCount() method
        System.out.println("The total number of active threads are(after starting t1): " + tg.activeCount());

        t2.start();
        System.out.println("The total number of active threads are(after starting t2): " + tg.activeCount());

        t3.start();
        System.out.println("The total number of active threads are(after starting t3): " + tg.activeCount());

        tg.list();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }
        System.out.println("The total number of active threads are(after completion of t1,t2,t3): " + tg.activeCount());
    }
}
