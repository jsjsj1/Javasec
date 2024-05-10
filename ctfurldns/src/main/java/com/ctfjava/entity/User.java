package com.ctfjava.entity;

import java.util.Objects;

public class User {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        else return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    public void hello(String arg){
        System.out.println("hello~"+arg);
    }
}
