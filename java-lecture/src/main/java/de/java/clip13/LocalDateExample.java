package de.java.clip13;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.of(2022,2,2));
        System.out.println(localDate.parse("2022-02-22"));

        LocalDate tmw = LocalDate.now().plusDays(1);
        System.out.println(tmw);
    }
}
