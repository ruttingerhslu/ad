package ch.hslu.sw01.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testZeroFibonacci() {
        assertEquals(0, fibonacci.fiboRec1(0));
    }
}