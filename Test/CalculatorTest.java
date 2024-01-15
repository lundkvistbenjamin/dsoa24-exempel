import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testMultiplyTwo() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void testMultiplyThree() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(2, 2, 2));
    }

}
