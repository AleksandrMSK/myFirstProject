package com.java;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        String str = "Hello";

        long l = 100;
        int b = (int) l;

        Person person = new Person();
        person.setName("Sveta");
        String name = person.getName();
        System.out.println(name);
    }
}
