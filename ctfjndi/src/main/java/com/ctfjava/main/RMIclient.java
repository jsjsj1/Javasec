package com.ctfjava.main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIclient {
    public static void main(String[] args) throws Exception {
        Registry registry= LocateRegistry.getRegistry("localhost",8088);
        TestRMI testRMI= (TestRMI) registry.lookup("hello");
        testRMI.ctfjava(new readExp());
    }
}
