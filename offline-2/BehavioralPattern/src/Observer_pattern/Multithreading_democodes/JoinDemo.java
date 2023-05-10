package Observer_pattern.Multithreading_democodes;

class ThreadJoinDemo extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(this.getName() + ": i = " + i);
            try{Thread.sleep(1000);}
            catch(InterruptedException e){e.printStackTrace();}
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();   t1.setName("<1>");
        ThreadJoinDemo t2 = new ThreadJoinDemo();   t2.setName("<2>");
        ThreadJoinDemo t3 = new ThreadJoinDemo();   t3.setName("<3>");

        t1.start();
        try {
            System.out.println("Waiting for " + t1.getName() + " to complete its execution");
            t1.join();
            System.out.println(t1.getName() + " complete, returning to " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
    }
}
