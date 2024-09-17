package de.java.clip13;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date(1000));
        System.out.println(new Date().after(new Date(1)));
        System.out.println(new Date().compareTo(new Date(1)));
    }
}
