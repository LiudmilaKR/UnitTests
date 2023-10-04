package seminar3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }
    @Test
    void evenOddNumberTrue() {
        assertTrue(mainHW.evenOddNumber(4));
    }
    @Test
    void evenOddNumberFalse() {
        assertFalse(mainHW.evenOddNumber(5));
    }
    @Test
    void numberIntervalTrue() {
        assertTrue(mainHW.numberInInterval(26));
        assertTrue(mainHW.numberInInterval(99));
    }
    @Test
    void numberIntervalFalse() {
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
    }
}
