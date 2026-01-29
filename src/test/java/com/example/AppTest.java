package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void addsNumbers() {
        App app = new App();
        assertEquals(3, app.add(1, 2));
    }
}
