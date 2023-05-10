package Observer_pattern.ServerToUserCommunication;

public class UserData {
    Observer observer;
    boolean isPaying;
    boolean isUsingBothServers;
    float totalBill = 0.0f;

    UserData(Observer ob, boolean pay, float bill){
        this.observer = ob;
        this.isPaying = pay;
        this.isUsingBothServers = false;
        this.totalBill = bill;
    }
}
