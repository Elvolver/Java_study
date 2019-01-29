package Java_study.ConstructorsCall;

class B {
    static {
        System.out.print("A");
    }
    static void method() {
        System.out.print("B");
    }
    B() {
        System.out.print("C");
    }
    B(String s) {
        System.out.print(s);
    }
}
