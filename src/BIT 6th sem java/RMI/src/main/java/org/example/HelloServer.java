package org.example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements HelloService{
    protected HelloServer() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        return "Hello World";
    }
}
