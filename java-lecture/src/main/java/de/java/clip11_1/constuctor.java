package de.java.clip11_1;

public class constuctor {
    static class Person
    {
        String name;
        String country;
        int age;

        Person(String name, String country, int age)
        {
            this.name = name;
            this.country = country;
            this.age = age;
        }
        Person()
        {

        }
    }

    public static void main(String[] args) {
        Person minsoo = new Person("minsoo", "korea", 30);
        Person minoh = new Person();

        minoh.name = "minoh";
        minoh.country = "Korea";
        minoh.age = 10;



        Person[] persons = {minsoo, minoh};
        //System.out.println(Arrays.toString(persons));
        for(Person cur: persons)
        {
            System.out.println("Introduce");
            System.out.println("Hi " + cur.name);
            System.out.println("I am " + cur.age);
            System.out.println("I am from " + cur.country);
            System.out.println();

        }
    }
}
