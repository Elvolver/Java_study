package Java_study.Patterns.Observer.ParametredObserver;

import javax.management.monitor.StringMonitor;
import java.util.List;
import java.util.Map;

public interface Observer {
    public void handleEvents(Map<String, List<String>> vacancies);
    public void addCategory(String categiry);
    public void removeCategory(String categiry);
}
