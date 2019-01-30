package Java_study.Patterns.Observer;

public class App {
    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Developer");
        jobSite.addVacancy("Junior");

        Observer firstSubscriber = new Subscriber("Dmitry");
        Observer secondSubscriber = new Subscriber("Piter");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Senior");

        jobSite.removeVacancy("Developer");
    }
}
