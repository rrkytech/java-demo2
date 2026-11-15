package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals(
            "Hello from automatichari hari Jenkins webhook!",
            App.getMessage()
        );
    }
}
