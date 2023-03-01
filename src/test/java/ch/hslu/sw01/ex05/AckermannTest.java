package ch.hslu.sw01.ex05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AckermannTest {
    Ackermann ack = new Ackermann();

    @Test
    void ackTest() {
        assertEquals(61, ack.ack(5,3));
    }
}