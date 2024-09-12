package de.java.clip11_6;

public abstract class Bird {
    private int x,y,z;

    void fly(int x, int y, int z) {
        System.out.println("이동");
        this.x = x;
        this.y = y;
        if (flyAble(z)) {
            this.z = z;
        }
        else {
            System.out.println("not fly");
        }
        printLoc();
    }

    public void printLoc() {
        System.out.println(x + "," + y +  "," + z);
    }

    abstract boolean flyAble(int z);
}
