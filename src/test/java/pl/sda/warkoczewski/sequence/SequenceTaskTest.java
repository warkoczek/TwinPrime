package pl.sda.warkoczewski.sequence;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SequenceTaskTest {

    SequenceTask task = new SequenceTask();

    @Test
    public void getSecondSmallestIntegerShouldReturn5() {
        //given
        int[] array = new int[5];
        array[0] = 100;
        array[1] = 30;
        array[2] = 1;
        array[3] = 5;
        array[4] = 7;



        int expectedResult = 5;

        //when
        int result = task.getSecondSmallestInteger(array);

        //then
        Assert.assertEquals(expectedResult,result);

    }
}