package ru.ishchenko.task25_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public boolean isUnique(Map<String, String> map) {
                if (map.isEmpty())
                    return true;
                Set<String> values = new HashSet<>(map.values());
                return map.size() == values.size();
            }
        };

        //Проверка на пустую МАПу
        Map<String, String> map = new HashMap<>();
        System.out.println(action.isUnique(map));

        map.put("Вася", "Пупкин");
        map.put("Петя", "Пупкин");
        map.put("Коля", "Сидоров");
        System.out.println(action.isUnique(map));

        map.remove("Петя");
        System.out.println(action.isUnique(map));

    }
}
