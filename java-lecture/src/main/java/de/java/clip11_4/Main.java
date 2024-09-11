package de.java.clip11_4;

public class Main {
    static class Animal{
        String name;

        Animal(String name) {
            this.name = name;
        }

        public void cry() {
            System.out.println(name + " is crying.");
        }
    }

    static class Dog extends Animal {
        String breed;


        Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        public void swim() {
            System.out.println(name + "(" + breed + ") is swimming.");
        }
    }

    static class Cow extends Animal {

        Cow(String name) {
            super(name);
        }

        @Override
        public void cry() {
            super.cry();
            System.out.println(name + " cannot cry");
        }
    }

    static class Cat extends Animal {

        Cat(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("coco", "허스키");
        dog.cry();
        dog.swim();

        Cow cow = new Cow("cow");
        cow.cry();
    }
}
