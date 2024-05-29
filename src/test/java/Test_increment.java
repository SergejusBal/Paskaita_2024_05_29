import org.example.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_increment {

    static Calculator calculator;
    @BeforeAll
    public static void paruoštiObjektus() {
        calculator = new Calculator();

    }


    @Test
    public void increment_TestwithPositive_returnsInt() {
        //Arrange
        int testNumber = 2;
        int expected = 3;
        //Assert
        int actual = calculator.increment(testNumber);
        //Act
        assertEquals(expected, actual);
    }

    @Test
    public void increment_TestwithNedative_returnsInt() {
        //Arrange
        int testNumber = -2;
        int expected = -1;
        //Assert
        int actual = calculator.increment(testNumber);
        //Act
        assertEquals(expected, actual);
    }




}
