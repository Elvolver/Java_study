package Java_study.ObjectEquals;

import Java_study.Furniture.Chair;
import Java_study.Furniture.ModernChair;

public class Application {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(6);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle2.equals(circle3));
    }

}
