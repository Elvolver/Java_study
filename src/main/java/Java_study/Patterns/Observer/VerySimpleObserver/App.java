package Java_study.Patterns.Observer.VerySimpleObserver;

public class App {
    public static void main(String[] args) {
        NewsSite newsSite = new NewsSite();
        Subscriber dima = new Subscriber("Dima");
        newsSite.addObserver(dima);
        newsSite.addNew("Decl is dead");
    }
}
