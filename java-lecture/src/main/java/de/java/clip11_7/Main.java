package de.java.clip11_7;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1,2,3);

        Pigeon bird2 = new Pigeon();
        bird2.printLoc();

        System.out.println(bird.MINOH);
    }
}
