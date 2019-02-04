package Java_study.Patterns.Observer.VerySimpleObserver;

public interface Observed {
    void addObserver(Observer observer);
    void notifyObservers();
}
