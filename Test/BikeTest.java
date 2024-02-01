import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testInstantiateBike() {
        Bike bike = new Bike("testbike", 500);

        assertEquals(bike.getName(), "testbike");
    }

    @Test
    void testBikePrice() {
        Bike bike = new Bike("testbike", 100);

        assertEquals(100, bike.getPrice());
    }

}