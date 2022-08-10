package Turtles;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {
    @Test
    public void GCDTest1() {
        Instant start = Instant.now();
        Integer expected = 6;
        Assert.assertEquals(expected, GCD.greatest(24, 6));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
    @Test
    public void GCDTest2() {
        Instant start = Instant.now();
        Integer expected = 3;
        Assert.assertEquals(expected, GCD.greatest(12345, 123));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
    @Test
    public void GCDTest3() {
        Instant start = Instant.now();
        Integer expected = 1;
        Assert.assertEquals(expected, GCD.greatest(1298120983, 123124));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
    @Test
    public void GCDTest4() {
        Instant start = Instant.now();
        Integer expected = 5;
        Assert.assertEquals(expected, GCD.greatest(25, 5));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
}
