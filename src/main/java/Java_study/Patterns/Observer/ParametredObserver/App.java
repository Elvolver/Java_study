package Java_study.Patterns.Observer.ParametredObserver;

public class App {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("CPP", "Developer");
        jobSite.addVacancy("Java", "Junior");

        Observer firstSubscriber = new Subscriber("Dmitry");
        Observer secondSubscriber = new Subscriber("Piter");
        Observer thirdSubscriber = new Subscriber("Ivan");

        firstSubscriber.addCategory("CPP");
        secondSubscriber.addCategory("Java");
        thirdSubscriber.addCategory("PHP");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);

        jobSite.addVacancy("CPP", "Senior");

        jobSite.removeVacancy("CPP", "Developer");
    }
}
