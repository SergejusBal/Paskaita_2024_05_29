import org.example.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_divide {
    static Calculator calculator;
    @BeforeAll
    public static void paruoštiObjektus() {
        calculator = new Calculator();

    }

    @Test
    public void divide_PositiveAndPositive_returnsInt() {
        //Arrange
        int testNumber1 = 5;
        int testNumber2 = 2;
        int expected = 2;
        //Assert
        int actual = calculator.divide(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void divide_PositiveAndNegative_returnsInt() {
        //Arrange
        int testNumber1 = -12;
        int testNumber2 = 5;
        int expected = -2;
        //Assert
        int actual = calculator.divide(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void divide_NegativeAndNegative_returnsInt() {
        //Arrange
        int testNumber1 = -10;
        int testNumber2 = -5;
        int expected = 2;
        //Assert
        int actual = calculator.divide(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }
    @Test
    public void divide_DevitionFromZero_returnsInt() {
        //Arrange
        int testNumber1 = -10;
        int testNumber2 = 0;
        int expected = 0;
        //Assert
        int actual = calculator.divide(testNumber1,testNumber2);
        //Act
        assertEquals(expected, actual);
    }




}
