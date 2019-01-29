package Java_study.ConstructorsCall;

public class A extends B {
    {
        System.out.print("D");
    }
    A(String s) {
        super(s);
        System.out.print(s);
    }
    public static void main(String[] args) {
        System.out.print("E");
        new A("F");
        System.out.print("G");
    }
}