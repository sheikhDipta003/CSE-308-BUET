package Mediator_pattern;

import java.util.ArrayList;

public class ChatMediator implements IChatMediator{
    ArrayList<IUser> users;

    ChatMediator(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, String userFrom, String userTo) {
        for(IUser u: users){
            if(userTo.equalsIgnoreCase("all") && !u.getUserName().equals(userFrom)) u.receive(msg, userFrom);
            else if(u.getUserName().equals(userTo)){
                u.receive(msg, userFrom);
                break;
            }
        }
    }

    @Override
    public void addUser(IUser user) {
        this.users.add(user);
    }
}
