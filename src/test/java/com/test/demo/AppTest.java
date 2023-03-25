package com.test.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testSayHello() {
        App app = new App();
        String result = app.sayHello();
        assertEquals("Hello World", result);
    }

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(1, 1);
        assertEquals(2, result);
    }
}