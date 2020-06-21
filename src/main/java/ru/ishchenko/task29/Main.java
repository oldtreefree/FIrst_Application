package ru.ishchenko.task29;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> map = createMap();
        removeTheDuplicates(map);
        System.out.println(map);
    }

    private static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", Sex.FEMALE);
        Person person2 = new Person(34, "Сидорова", Sex.FEMALE);
        Person person3 = new Person(34, "Тихонова", Sex.FEMALE);
        Person person4 = new Person(35, "Петров", Sex.MALE);
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    private static void removeTheDuplicates(Map<String, Person> map) {
        Set<Person> uniqueList = new HashSet<>();
        List<Person> duplicateList = new ArrayList<>();
        for (Map.Entry<String, Person> pair : map.entrySet()) {
            if (!uniqueList.add(pair.getValue())) {
                duplicateList.add(pair.getValue());
            }
        }
        for (Person person : duplicateList)
            removeItemFromMapByValue(map, person);
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
                break;
            }
        }
    }
}
