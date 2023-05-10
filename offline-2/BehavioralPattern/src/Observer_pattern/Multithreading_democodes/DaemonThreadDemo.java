package Observer_pattern.Multithreading_democodes;

class TestDaemonThread extends Thread{
    @Override
    public void run(){
        System.out.println("current thread : " + Thread.currentThread().getName());
        if(Thread.currentThread().isDaemon()) System.out.println("Daemon thread related work");
        else System.out.println("User thread related work");
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) {
        TestDaemonThread t1 = new TestDaemonThread();   t1.setName("<1>");
        TestDaemonThread t2 = new TestDaemonThread();   t2.setName("<2>");
        TestDaemonThread t3 = new TestDaemonThread();   t3.setName("<3>");

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
