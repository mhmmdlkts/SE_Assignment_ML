import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class testHand {

    @org.junit.jupiter.api.Test
    void generateHand() {
    }

    @org.junit.jupiter.api.Test
    void calculateValue() {
        generateHand generateHand1 = new generateHand("HA ST HT");
        generateHand generateHand2 = new generateHand("S2 S3 DJ");
        generateHand generateHand3 = new generateHand("S3 S4 H5");

        assertEquals(21, generateHand1.value);
        assertEquals(10, generateHand2.value);
        assertEquals(7, generateHand3.value);
    }

    @org.junit.jupiter.api.Test
    void calculateValueIllegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new generateHand("S10 S4 H5"); });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new generateHand("S1 S4 H5"); });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new generateHand("S11 F4 H5"); });
    }
}