package pl.sda.warkoczewski;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwinPrimeTest {

    TwinPrime twinPrime = new TwinPrime();

    @Test
    public void areTwinsShouldReturnTrue() {
        //given
        int m = 5;
        int n = 7;
        boolean expectedResult = true;

        //when
        boolean result = twinPrime.areTwins(m,n);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void isDifferenceTwoShouldReturnTrue() {
        //given
        int m = 3;
        int n = 5;
        boolean expectedResult = true;

        //when
        boolean result = twinPrime.isDifferenceTwo(m,n);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void isMultipleOfSixShouldReturnTrue() {
        //given
        int m = 3;
        int n = 5;
        boolean expectedResult = true;

        //when
        boolean result = twinPrime.isMultipleOfSix(m,n);

        //then
        Assert.assertTrue(result);

    }


}