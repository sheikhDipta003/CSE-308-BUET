package Mediator_pattern;

public class User extends IUser{
    User(IChatMediator md, String msg){
        super(md, msg);
    }

    @Override
    public void send(String message, String userTo) {
        System.out.println("'" + this.userName + "' sent to '" + userTo + "': " + message);
        mediator.sendMessage(message, this.userName, userTo);
    }

    @Override
    public void receive(String message, String userFrom) {
        System.out.println("'" + this.userName + "' received from '" + userFrom + "': " + message);
    }
}
