package Java_study.Patterns.Observer.VerySimpleObserver;

import java.util.List;

public interface Observer {
    void handleEvents(List<String> news);
}
