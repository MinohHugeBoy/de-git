package de.java.clip18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;

public class TcpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("[" + LocalTime.now() + "] server is ready.");
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        while  (true) {
            try {
                System.out.println("[" + LocalTime.now() + "] server is waiting connection request.");
                Socket socket = serverSocket.accept();
                System.out.println("[" + LocalTime.now() + "] server is connected.");

                InputStream inputStream = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                String inputString = bufferedReader.readLine();
                System.out.println("msg from client: " + inputString);

                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("World");
                System.out.println("[" + LocalTime.now() + "] Data transmitted.");
                dataOutputStream.close();
                socket.close();;

            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }
}
