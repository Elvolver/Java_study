package Java_study.Lambda;

public class App {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> x + y;
        System.out.println(operation.calculate(10, 20)); //30
        operation = (x, y) -> x - y;
        System.out.println(operation.calculate(10, 20)); //-30
    }
}
