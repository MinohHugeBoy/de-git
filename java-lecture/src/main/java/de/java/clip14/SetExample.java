package de.java.clip14;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);
        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LAS");
        stringSet.add("LAX");
        stringSet.add("NYY");
        stringSet.add("YZZ");
        System.out.println(stringSet);






    }
}
