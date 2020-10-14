package com.example.test;

import com.example.test.greeting.Greeting;
import org.junit.jupiter.api.Test;

public class GreetingTest {



    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("John"));
    }
}
