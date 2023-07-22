package org.example;

import static org.junit.Assert.assertEquals;
import code.challenges.Challenge_01;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class Challenge_01_Test
{
    /**
     * Test Challenge01
     */
    @Test
    public void challenge01Test()
    {
        int[] test1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result1 = Challenge_01.integersInRangeNotInArr(test1);
        assertEquals(List.of(5, 6), result1);

        int[] test2 = {1, 1};
        List<Integer> result2 = Challenge_01.integersInRangeNotInArr(test2);
        assertEquals(List.of(2), result2);

        int[] test3 = {1, 1, 1, 1, 1};
        List<Integer> result3 = Challenge_01.integersInRangeNotInArr(test3);
        assertEquals(List.of(2, 3, 4, 5), result3);
    }


}
