package com.driver;

public class RWOnly {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
        System.out.println("name is set");
    }
}
