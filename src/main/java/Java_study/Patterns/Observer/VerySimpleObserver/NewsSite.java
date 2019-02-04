package Java_study.Patterns.Observer.VerySimpleObserver;

import java.util.ArrayList;
import java.util.List;

public class NewsSite implements Observed {
    private List<String> news = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    void addNew(String New) {
        news.add(New);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.handleEvents(this.news);
        }
    }
}
