package com.test.demo;

/**
 * Hello world!
 *
 */
public class App {
    public String sayHello() {
        return "Hello World";
    }

    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(new App().sayHello());
    }
}