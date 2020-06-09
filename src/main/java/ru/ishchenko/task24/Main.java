package ru.ishchenko.task24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public Set<String> removeEvenLength(Set<String> set) {
                Iterator<String> iterator = set.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().length() % 2 == 0) {
                        iterator.remove();
                    }
                }
                return set;
            }
        };
        Set<String> strings = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        System.out.println(action.removeEvenLength(strings));
    }
}
