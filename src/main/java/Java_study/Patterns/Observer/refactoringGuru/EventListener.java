package Java_study.Patterns.Observer.refactoringGuru;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
