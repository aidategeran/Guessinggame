package aida;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void heartPrintHeart() {
        assertEquals("♥", Suit.HEARTS.toString());
    }
}