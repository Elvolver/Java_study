package Java_study.ConstructorsCall;

public class A extends B {
    {
        System.out.print("Нестатический блок иницаализации дочернего класса\n");
    }
    static {
        System.out.print("Статический блок иницаализации дочернего класса\n");
    }
    A(String s) {
        super(s);
        System.out.print("Конструктор дочернего класса с параметром "+s+"\n");
    }
    public static void main(String[] args) {
        System.out.print("Вывод строки до конструктора\n");
        new A("F");
        System.out.print("Вывод строки после конструктора\n");
    }
}