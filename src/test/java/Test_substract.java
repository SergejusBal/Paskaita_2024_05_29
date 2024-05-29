import org.example.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_substract {
    static Calculator calculator;
    @BeforeAll
    public static void paruoštiObjektus() {
        calculator = new Calculator();

    }

    @Test
    public void subtract_PositiveAndPositive_returnsInt() {
        //Arrange
        int testNumber1 = 5;
        int testNumber2 = 2;
        int expected = 3;
        //Assert
        int actual = calculator.Subtract(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void subtract_PositiveAndNegative_returnsInt() {
        //Arrange
        int testNumber1 = -2;
        int testNumber2 = 5;
        int expected = -7;
        //Assert
        int actual = calculator.Subtract(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void subtract_NegativeAndNegative_returnsInt() {
        //Arrange
        int testNumber1 = -2;
        int testNumber2 = -5;
        int expected = 3;
        //Assert
        int actual = calculator.Subtract(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
}
