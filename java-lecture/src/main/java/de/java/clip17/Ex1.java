package de.java.clip17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("seoul");
        list.add("daejeon");
        list.add("dongtan");
        System.out.println(list);

        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);

        List<String> result2 = list.stream()
                .filter("seoul"::equals)
                .collect(Collectors.toList());

        System.out.println(result2);

    }
}
