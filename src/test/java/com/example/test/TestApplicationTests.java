package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class TestApplicationTests {

    @Test
    void testMultiplicationDollar() {
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(10), dollar.times(2));
        assertEquals(new Dollar(15), dollar.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Frank(5));
    }

    @Test
    void testMultiplicationFrank() {
        Frank frank = new Frank(5);
        assertEquals(new Frank(10), frank.times(2));
        assertEquals(new Frank(15), frank.times(3));
    }

    @Test
    void testEqualityFrank() {
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(8));
    }


}
