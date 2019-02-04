package Java_study.Patterns.Observer.ParametredObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Subscriber implements Observer {
    String name;
    List<String> categories = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void handleEvents(Map<String, List<String>> vacansies) {
        List<String> vacanciesOfCategory = new ArrayList<>();
        for (String category : categories)
        {
            List<String> vacanciesForSubscriber = vacansies.get(category);
            if (vacanciesForSubscriber != null) {
                vacanciesOfCategory.addAll(vacanciesForSubscriber);
            }
            System.out.println("Dear " + name + "\nWe have some changes vacancies" + vacansies.get(category));
        }
    }

    @Override
    public void addCategory(String category) {
        categories.add(category);
    }

    @Override
    public void removeCategory(String category) {
        categories.remove(category);
    }
}
