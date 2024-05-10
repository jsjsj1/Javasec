package com.ctfjava.main.impl;

import com.ctfjava.main.TestRMI;
import com.ctfjava.main.readExp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//UnicastRemoteObject 用来持续连接  implements TestRMI实现TestRMI接口
public class RMItesttmpl extends UnicastRemoteObject implements TestRMI {

    public RMItesttmpl() throws RemoteException {
    }

    @Override
    public String hello() throws Exception {
//        Runtime.getRuntime().exec("calc");
        return null;
    }

    @Override
    public Object ctfjava(Object readExp) throws Exception {
        return null;
    }

}
