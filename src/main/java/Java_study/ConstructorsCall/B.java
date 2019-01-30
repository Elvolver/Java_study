package Java_study.ConstructorsCall;

class B {
    {
        System.out.print("Нестатический блок иницаализации базового класса\n");
    }
    static {
        System.out.print("Статический блок иницаализации базового класса\n");
    }
    static void method() {
        System.out.print("Статический метод базового класса\n");
    }
    B() {
        System.out.print("Базовый конструктор\n");
    }
    B(String s) {
        System.out.print("Базовый конструктор с параметром "+s+"\n");
    }
}
