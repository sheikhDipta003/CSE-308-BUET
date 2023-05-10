package offline_1_q1;

import java.util.Scanner;

public class GamingPC implements PCBuilder{
    PC pc = new PC();

    @Override
    public void addProcessor() {
        pc.add(new PCpart("AMD Ryzen 7 5700 X", 28000, 1));
    }

    @Override
    public void addCPU() {
        pc.add(new PCpart("CPU-Gaming", 0, 1));
    }

    @Override
    public void addMB() {
        pc.add(new PCpart("MB-Gaming", 0, 1));
    }

    @Override
    public void addHDD() {
        pc.add(new PCpart("1TB HDD", 0, 1));
    }

    @Override
    public void addBase() {
        pc.add(new PCpart("Base", 70000, 1));
    }

    @Override
    public void addCPUCooler() {
        pc.add(new PCpart("CPU Cooler", 36000, 0));
    }

    @Override
    public void addLiquidCooler() {
        pc.add(new PCpart("Liquid cooler", 17000, 0));
    }

    @Override
    public void addDrive() {
        pc.add(new PCpart("DVD drive", 6000, 0));
    }

    @Override
    public int addRAM() {
        int count1 = 0, count2 = 0;

        while(true){
            System.out.print("RAM: ");
            Scanner scanner = new Scanner(System.in);
            String RAMType = scanner.nextLine();
            if(RAMType.equalsIgnoreCase("O")){
                System.out.println("Cannot place another order while current one is not complete");
            }
            else if(RAMType.equalsIgnoreCase("E"))    break;
            else if (RAMType.equalsIgnoreCase("2666 MHz")) {
                count1++;
            } else if (RAMType.equalsIgnoreCase("3200 MHz")) {
                count2++;
            }
            else{
                System.out.println("Wrong type. Either '2666 MHz' or '3200 MHz'");
            }
        }

        pc.add(new PCpart("2666 MHz", 2620, count1));
        pc.add(new PCpart("3200 MHz", 2950, count2));

        return (count1 + count2);
    }

    @Override
    public int addGraphicsCard() {
        int count1 = 0, count2 = 0;

        while(true){
            System.out.print("Graphics Card: ");
            Scanner scanner = new Scanner(System.in);
            String GCType = scanner.nextLine();
            if(GCType.equalsIgnoreCase("O")){
                System.out.println("Cannot place another order while current one is not complete");
            }
            else if(GCType.equalsIgnoreCase("E"))    break;
            else if (GCType.equalsIgnoreCase("2GB")) {
                count1++;
            } else if (GCType.equalsIgnoreCase("4GB")) {
                count2++;
            }
            else{
                System.out.println("Wrong type. Either '2GB' or '4GB'");
            }
        }

        pc.add(new PCpart("2GB", 6500, count1));
        pc.add(new PCpart("4GB", 7600, count2));

        return (count1 + count2);
    }

    @Override
    public PC getPC() {
        return pc;
    }
}

