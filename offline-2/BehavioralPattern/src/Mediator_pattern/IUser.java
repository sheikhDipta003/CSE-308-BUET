package Mediator_pattern;

public abstract class IUser {
    protected IChatMediator mediator;
    protected String userName;

    IUser(IChatMediator mediator, String userName){
        this.mediator = mediator;
        this.userName = userName;
    }

    public abstract void send(String message, String userTo);
    public abstract void receive(String message, String userFrom);

    public String getUserName() {
        return userName;
    }
}
