package de.java.clip11_7;

public class Pigeon implements Bird {
    int x, y, z;
    @Override
    public void fly(int x, int y, int z) {
        System.out.println("move");
        this.x = x;
        this.y = y;
        this.z = z;
        printLoc();
    }

    public void printLoc() {
        System.out.println(x + ", " + y + ", " + z);
    }
}
