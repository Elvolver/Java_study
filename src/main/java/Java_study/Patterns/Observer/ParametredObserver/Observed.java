package Java_study.Patterns.Observer.ParametredObserver;

public interface Observed {
    public void addObserver (Observer observer);
    public void removeObserver (Observer observer);
    public void notifyObservers();
}
