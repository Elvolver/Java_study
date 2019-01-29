package Java_study.ObjectEquals;

public class App {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(6);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle2.equals(circle3));
        System.out.println(circle1 == circle2);
    }

}
