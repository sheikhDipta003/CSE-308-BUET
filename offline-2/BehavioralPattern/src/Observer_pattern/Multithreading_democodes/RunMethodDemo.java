package Observer_pattern.Multithreading_democodes;

public class RunMethodDemo extends Thread{
    public static void main(String[] args) {
        RunMethodDemo t1 = new RunMethodDemo();
        RunMethodDemo t2 = new RunMethodDemo();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        /*t1.start();
        t2.start();*/
        t1.run();       //In this case, no context switching occurs, because t1,t2 are treated as normal object, not thread obj
        t2.run();
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("<" + this.getName() + ">: i = " + i);
        }
    }
}
