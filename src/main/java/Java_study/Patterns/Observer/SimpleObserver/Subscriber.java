package Java_study.Patterns.Observer.SimpleObserver;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void handleEvents(List<String> vacansies) {
        System.out.println("Dear " + name + "\nWe have some changes vacancies" + vacansies);
    }
    public void addCategory() {

    }
}
