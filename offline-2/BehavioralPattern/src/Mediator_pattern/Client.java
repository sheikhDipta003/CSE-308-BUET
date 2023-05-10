package Mediator_pattern;

public class Client {
    public static void main(String[] args) {
        IChatMediator mediator = new ChatMediator();
        IUser user1 = new User(mediator, "Oggy");
        IUser user2 = new User(mediator, "Jack");
        IUser user3 = new User(mediator, "Joey");
        IUser user4 = new User(mediator, "Bob");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All", "all");
        user3.send("Good evening", user1.getUserName());
    }
}
