package de.java.clip18;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {
    public static void main(String[] args) {

        try {
            String serverIp = "localhost";
            System.out.println("server is connecting");
            System.out.println("server IP: " + serverIp);
            Socket socket = new Socket(serverIp, 8888);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello\n".getBytes(StandardCharsets.UTF_8));
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("msg from server: " + dataInputStream.readUTF());
            dataInputStream.close();
            socket.close();

            System.out.println("connection is closed.");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
