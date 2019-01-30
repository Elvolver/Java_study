package Java_study.Patterns.Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Observer>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<Observer>());
        }
    }

    public void subscribe(String eventType, Observer listener) {
        List<Observer> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Observer listener) {
        List<Observer> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType) {
        List<Observer> users = listeners.get(eventType);
        for (Observer listener : users) {
            listener.handleEvents(eventType);
        }
    }
}