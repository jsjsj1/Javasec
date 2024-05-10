package com.ctfjava.main;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Hashtable;

public class RMIclient2 {
    public static void main(String[] args) throws NamingException {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");//支持远程连接
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");//支持远程连接
        Hashtable env=new Hashtable();
        //put上下文，com.sun.jndi.rmi.registry.RegistryContextFactory是服务端的一个上下文的库
        env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put(Context.PROVIDER_URL,"rmi://localhost:8088");
        //url是来被查询的服务端的地址/命名
        String url="rmi://localhost:8088/hello";
        Context context=new InitialContext(env);
        context.lookup(url);
    }
}
