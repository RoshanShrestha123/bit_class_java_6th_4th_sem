package org.example;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("Port 1212 is open for connection");
        System.out.println("Enter some message to send");

        try{
            ServerSocket serverSocket = new ServerSocket(12345);
//            serverSocket.accept();
            Socket socket = serverSocket.accept();
            System.out.println("A new connection success");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            Scanner userInput = new Scanner(System.in);
            while(true){
                String inputString = userInput.nextLine();
                printWriter.println(inputString);
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}