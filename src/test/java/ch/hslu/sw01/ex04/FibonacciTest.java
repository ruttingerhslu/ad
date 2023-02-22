package ch.hslu.sw01.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testZeroFibonacci() {
        assertEquals(0, fibonacci.fiboRec1(0));
    }

    @Test
    void testOneFibonacci() {
        assertEquals(1, fibonacci.fiboRec1(1));
    }

    @Test
    void testTwoFibonacci() {
        assertEquals(1, fibonacci.fiboRec1(2));
    }

    @Test
    void testFibRec2() {
        assertEquals(377, fibonacci.fiboRec2(14));
    }

    @Test
    void testFibIter() {
        assertEquals(377, fibonacci.fiboIter(14));
    }
}