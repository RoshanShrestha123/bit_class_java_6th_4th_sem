package org.example;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client");
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] data = new byte[1924];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        // receiving message
        socket.receive(packet);
        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println(message);
        socket.close();
    }
}
