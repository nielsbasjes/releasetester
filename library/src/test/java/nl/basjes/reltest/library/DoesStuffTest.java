package nl.basjes.reltest.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoesStuffTest {
    @Test
    void runTest() {
        assertEquals(5, DoesStuff.sum(2, 3));
        assertEquals(0, DoesStuff.sum(-3, 3));
    }
}
