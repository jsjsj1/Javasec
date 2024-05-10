package com.ctfjava.main;

import java.io.IOException;

public class Payload {
    static{
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){

    }
}
