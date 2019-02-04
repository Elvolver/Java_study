package Java_study.Generics;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Dmitry", "Volkov");
        System.out.println(map.get("Dmitry"));
        System.out.println(map.get("Volkov"));
    }
}
