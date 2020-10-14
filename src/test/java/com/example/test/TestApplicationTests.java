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
        Dollar product = dollar.times(2);
        assertEquals(new Dollar(10), product);
        product = dollar.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Frank(5));
    }

    @Test
    void testMultiplicationFrank() {
        Frank frank = new Frank(5);
        Frank product = frank.times(2);
        assertEquals(new Frank(10), product);
        product = frank.times(3);
        assertEquals(new Frank(15), product);
    }

    @Test
    void testEqualityFrank(){
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(8));
    }



}
