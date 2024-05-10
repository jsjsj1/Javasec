package com.ctfjava.main;

import com.ctfjava.main.impl.RMItesttmpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIserver {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        TestRMI testRMI=new RMItesttmpl();
        Registry registry= LocateRegistry.createRegistry(8088);
        registry.bind("hello",testRMI);
        System.out.println("server is start");
    }
}
