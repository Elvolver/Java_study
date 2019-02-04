package Java_study.Patterns.Observer.VerySimpleObserver;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvents(List<String> news) {
        System.out.println("Dear," + name + ". News for you:" + news);
    }
}
