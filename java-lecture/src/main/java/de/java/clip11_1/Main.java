package de.java.clip11_1;

import java.util.Arrays;

public class Main {
    static class Person
    {
        String name;
        String country;
        int age;
    }

    public static void main(String[] args) {
        Person minsoo = new Person();
        minsoo.name = "minsoo";
        minsoo.country = "Korea";
        minsoo.age = 10;

        Person[] persons = {minsoo};
        //System.out.println(Arrays.toString(persons));
        for(Person cur: persons)
        {
            System.out.println("Introduce");
            System.out.println("Hi " + cur.name);
            System.out.println("I am " + cur.age);
            System.out.println("I am from " + cur.country);

        }
    }
}
