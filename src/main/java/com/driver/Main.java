package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "name";
        // The field RWOnly.name is not visibleJava(33554503)
        obj.setName("name");
        System.out.println(obj.getName());

    }
}
