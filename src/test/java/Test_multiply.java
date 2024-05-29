import org.example.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_multiply {

    static Calculator calculator;
    @BeforeAll
    public static void paruoštiObjektus() {
        calculator = new Calculator();

    }

    @Test
    public void multiply_PositiveAndPositive_returnsInt() {
        //Arrange
        int testNumber1 = 2;
        int testNumber2 = 5;
        int expected = 10;
        //Assert
        int actual = calculator.Mutliply(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void multiply_PositiveAndNegative_returnsInt() {
        //Arrange
        int testNumber1 = -2;
        int testNumber2 = 5;
        int expected = -10;
        //Assert
        int actual = calculator.Mutliply(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void multiply_NegativeAndNegative_returnsInt() {
        //Arrange
        int testNumber1 = -2;
        int testNumber2 = -5;
        int expected = 10;
        //Assert
        int actual = calculator.Mutliply(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
}
