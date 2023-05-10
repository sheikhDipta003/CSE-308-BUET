package Observer_pattern;

interface Publisher {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}
