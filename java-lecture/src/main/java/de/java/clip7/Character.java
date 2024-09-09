package de.java.clip7;

public class Character {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);

        Defaults defaults = new Defaults();
        System.out.println(defaults.charDefault);
    }
    static class Defaults{
        char charDefault;
    }
}
