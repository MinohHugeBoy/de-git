package de.java.clip11_6;

public class Pigeon extends Bird{

    @Override
    boolean flyAble(int z) {
        return z < 10000;
    }
}
