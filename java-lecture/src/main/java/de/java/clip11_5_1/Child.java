package de.java.clip11_5_1;

import de.java.clip11_5.Access;

public class Child extends Access {
    public void call() {
        this.msgProtected();
        this.msgPublic();
    }
}
