package HW03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void evenOddNumber() {
        assertEquals(true, Main.evenOddNumber(2));
        assertEquals(false, Main.evenOddNumber(3));

    }

    @Test
    void numberInInterval() {
        assertEquals(true, Main.numberInInterval(25));
        assertEquals(false, Main.numberInInterval(24));
    }
}