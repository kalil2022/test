import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator=new SimpleCalculator();
    }
    @Test
    void  test_if_add_is_working(){
        assertEquals(5,calculator.add(2,3));
    }
}