package Mediator_pattern;

public interface IChatMediator {
    void sendMessage(String msg, String userFrom, String userTo);
    void addUser(IUser user);
}
