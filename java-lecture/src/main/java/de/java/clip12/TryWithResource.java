package de.java.clip12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResource {
    public static void main(String[] args) {
        // auto closable을 구현해야지 이렇게 사용 가능
        try (FileOutputStream out = new FileOutputStream("text.txt")) {
            out.write("Hello".getBytes(StandardCharsets.UTF_8));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
