package org.example;
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface HelloService extends Remote {
    public String printMessage() throws RemoteException;
}
