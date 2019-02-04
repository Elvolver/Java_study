package Java_study.Generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("Dmitry");
        list.add("Volkov");
        list.addAll(list2);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
