package de.java.clip11_5;

public class Access {
    private void msgPrivate () {
        System.out.println("Private");
    }

    void msgDefault () {
        msgPrivate();
        System.out.println("Default");
    }

    protected void msgProtected () {
        msgPrivate();
        System.out.println("Protected");
    }

    public void msgPublic () {
        msgPrivate();
        System.out.println("Public");
    }
}
