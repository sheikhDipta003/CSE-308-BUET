package Observer_pattern.Multithreading_democodes;

class createDemo1 extends Thread{
    createDemo1(String tName){
        super(tName);
    }

    @Override
    public void run(){
        System.out.println("Thread-1 is running");
        for(int i = 0; i < 5; i++) {
            System.out.println(this.getName() + ": i = " + i);
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class createDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread-2 is running");
        for(int i = 0; i < 5; i++) {
            System.out.println("<2>: i = " + i);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class CreateNewThread {
    public static void main(String[] args) {
        createDemo1 t1 = new createDemo1("<1>");
        t1.start();

        Thread t2 = new Thread(new createDemo2(), "<2>");
        t2.start();
    }
}
