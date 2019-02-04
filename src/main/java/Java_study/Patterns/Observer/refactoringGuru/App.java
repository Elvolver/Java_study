package Java_study.Patterns.Observer.refactoringGuru;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogNotificationListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
