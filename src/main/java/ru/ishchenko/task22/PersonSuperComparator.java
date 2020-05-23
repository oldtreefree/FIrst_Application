package ru.ishchenko.task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int compareName = o1.getName().compareTo(o2.getName());
        if (compareName == 0)
            return Integer.compare(o2.getAge(), o1.getAge());
        return compareName;
    }
}
