package com.ctfjava.util;

import java.io.*;

public class SerializeUtil {
    public static byte[] serialize(Object object){
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return byteArrayOutputStream.toByteArray();
    }
    public static Object unSerialize(byte[] bytes){
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(bytes);
        Object object;
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
            object=objectInputStream.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return object;
    }
}
