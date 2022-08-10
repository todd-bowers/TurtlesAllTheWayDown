package Turtles;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void factorialTest4() {
        //Given
        int given = 4;
        int expected = 24;
        //When
        int actual = Turtles.factorial(given);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest7() {
        //Given
        int given = 7;
        int expected = 5040;
        //When
        int actual = Turtles.factorial(given);
        //Then
        Assert.assertEquals(expected, actual);
    }

}