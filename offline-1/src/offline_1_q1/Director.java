package offline_1_q1;

import java.util.Scanner;

public class Director{
    PCBuilder myBuilder;
    private int totalItemCount = 0;

    public void build(PCBuilder builder){
        myBuilder = builder;
        myBuilder.addBase();        //0
        myBuilder.addProcessor();   //1
        myBuilder.addCPU();         //2
        myBuilder.addMB();          //3
        myBuilder.addHDD();         //4
        myBuilder.addCPUCooler();   //5
        myBuilder.addLiquidCooler();    //6
        myBuilder.addDrive();           //7

        int numRAM = 0, numGC = 0;

        do{
            System.out.print("RAM or Graphics Card: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("R")) {
                numRAM = myBuilder.addRAM();
                totalItemCount += numRAM;
            } else if (input.equalsIgnoreCase("G")) {
                numGC = myBuilder.addGraphicsCard();
                totalItemCount += numGC;
            }
            else if(input.equalsIgnoreCase("E")){
                if(totalItemCount == 0) System.out.print("Minimum 1 item must be ordered\n");
                else break;
            }
            else if(input.equalsIgnoreCase("O")){
                System.out.println("Cannot place another order while current one is not complete");
            }
            else {
                System.out.print("Invalid character\n");
            }
        }while(true);
    }
}

