package Observer_pattern.ServerToUserCommunication;

interface Observer {
    void update(String serverState, String text, boolean needsFeedback);
    void _notify(String message);
}
