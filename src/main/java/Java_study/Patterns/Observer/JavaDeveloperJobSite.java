package Java_study.Patterns.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();
    Map<String, List<EventListener>> subscribers = new HashMap<>();

    public  void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvents(this.vacancies);
        }
    }
}
