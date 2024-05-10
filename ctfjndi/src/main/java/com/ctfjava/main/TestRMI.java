package com.ctfjava.main;

import java.rmi.Remote;

//用来继承Remote库实现个接口，具体方法在impl来实现
public interface TestRMI extends Remote {
    public String hello() throws Exception;
    public Object ctfjava(Object a) throws Exception;

}
