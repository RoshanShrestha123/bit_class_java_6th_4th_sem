package org.example;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


// For UDP Socket program
public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello World";
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address,12345);

        // sending message
        socket.send(packet);
        socket.close();
    }
}