package nl.basjes.reltest.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void runTest() {
        assertEquals("Sum: 2 + 3 = 5", App.makeMsg(2, 3));
        assertEquals("Sum: -3 + 3 = 0", App.makeMsg(-3, 3));
    }

    @Test
    void runMain() {
        String[] params = new String[0];
        App.main(params);
    }
}
