package Observer;

public interface Subject {

    public void regisster(Observer obs);
    public void unregister(Observer obs);
    public void notifyObserver();
}
