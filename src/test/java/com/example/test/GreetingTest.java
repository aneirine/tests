package com.example.test;

import com.example.test.greeting.Greeting;
import org.junit.jupiter.api.*;

public class GreetingTest {

    Greeting greeting;
    private static int number;

    @BeforeAll
    public static void beforeAllTests() {
        number = 0;
        System.out.println("BEFORE ALL");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void testCompleted() {
        number++;
        System.out.println("Completed test  #" + number);
    }

    @AfterAll
    public static void testsCompleted() {
        System.out.println("completed all " + number + " tests");
    }
}
