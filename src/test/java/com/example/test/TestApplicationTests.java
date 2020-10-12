package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestApplicationTests {

    @Test
    void testMultiplications() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10, product.getAmount());
        product = dollar.times(3);
        assertEquals(15, product.getAmount());
    }

}
