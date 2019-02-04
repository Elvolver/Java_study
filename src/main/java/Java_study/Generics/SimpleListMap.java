package Java_study.Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleListMap {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> vacancies = new ArrayList<>();
        List<String> newVacancies = new ArrayList<>();

        vacancies.add("a");
        vacancies.add("b");
        vacancies.add("c");
        newVacancies.add("x");
        newVacancies.add("y");
        newVacancies.add("z");

        vacancies.addAll(newVacancies);

        map.put("Open vacancies", vacancies);
        System.out.println(map.get("Open vacancies"));
    }
}
