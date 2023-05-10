package offline_1_q1;

interface PCBuilder{
    void addBase();
    void addProcessor();
    void addCPU();
    void addMB();
    void addHDD();
    void addCPUCooler();
    void addLiquidCooler();
    void addDrive();
    int addRAM();
    int addGraphicsCard();
    PC getPC();
}