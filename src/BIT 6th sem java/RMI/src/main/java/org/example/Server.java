package org.example;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
       Registry registry = LocateRegistry.createRegistry(5099);
       registry.rebind("Hello", new HelloServer());
    }
}
