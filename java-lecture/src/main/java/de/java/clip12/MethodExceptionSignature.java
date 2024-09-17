package de.java.clip12;

public class MethodExceptionSignature {
    static void methondThrowsException() throws Exception {

    }

    static  void    methodThrowsRuntimeException() throws RuntimeException {

    }

    public static void main(String[] args) {
        methodThrowsRuntimeException();
        try {
            methondThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
