package aida;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void getValueOfAKing() {
        assertEquals(10, Rank.KING.getValue());
    }
}