package Observer_pattern.ServerToUserCommunication;

interface Publisher {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
    void getFeedback(boolean feedback);
}
