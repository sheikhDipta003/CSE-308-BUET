package Observer_pattern.Multithreading_democodes;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.SimpleDateFormat;

class Tasks implements Runnable
{
    private String taskName;

    // constructor of the class Tasks
    public Tasks(String str)
    {
// initializing the field taskName
        taskName = str;
    }

    // Printing the task name and then sleeps for 1 sec
// The complete process is getting repeated five times
    public void run()
    {
        try
        {
            for (int j = 0; j < 5; j++)
            {
                if (j == 0)
                {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

//prints the initialization time for every task
                    System.out.println("Start time for '"+ taskName + "' = " + sdf.format(dt));

                }
                else if(j == 4)
                {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

// prints the execution time for every task
                    System.out.println("End time for '" + taskName + "' = " +sdf.format(dt));

                }

// 1000ms = 1 sec
                Thread.sleep(500);
            }

            System.out.println("'" + taskName + "' is complete.");
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolDemo2 {
    // Maximum number of threads in the thread pool, we are executing 5 runnable tasks with only 3 threads, not 5
    static final int MAX_TH = 3;

    public static void main(String[] args) {
        // Creating five new tasks
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

// creating a thread pool with MAX_TH number of
// threads size the pool size is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

// passes the Task objects to the pool to execute (Step 3)
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

// pool is shutdown
        pl.shutdown();
    }
}
