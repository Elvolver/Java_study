package Java_study.Patterns.Observer.ParametredObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaDeveloperJobSite implements Observed {
    Map<String, List<String>> vacancies = new HashMap<>();
    List<Observer> subscribers = new ArrayList<>();

    boolean categoryIsMissing(String category) {
        return vacancies.get(category) == null;
    }

    void addVacancyCategoryIfMissing(String category) {
        if (categoryIsMissing(category)) {
            vacancies.put(category, new ArrayList<String>());
        }
    }

    public  void addVacancy(String category, String vacancy) {
        addVacancyCategoryIfMissing(category);
        List<String> vacancyOfCategory = vacancies.get(category);
//        if (vacancyOfCategory != null) {
            vacancyOfCategory.add(vacancy);
  //      }
        vacancies.put(category, vacancyOfCategory);
        notifyObservers();
    }

    public void removeVacancy(String category, String vacancy) {
        List<String> vacancyOfCategory = vacancies.get(category);
        vacancyOfCategory.remove(vacancy);
        vacancies.put(category, vacancyOfCategory);
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
