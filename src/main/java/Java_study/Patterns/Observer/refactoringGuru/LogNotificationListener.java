package Java_study.Patterns.Observer.refactoringGuru;

import java.io.File;

public class LogNotificationListener implements EventListener {
    private File log;

    public LogNotificationListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
