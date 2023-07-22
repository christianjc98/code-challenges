package org.example;

import code.challenges.Challenge_01;
import code.challenges.Challenge_02;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Challenge_02_Test {

    /**
     * Test Challenge02
     */
    @Test
    public void challenge02Test()
    {
        int[] nums1 = {2, 7, 1, 15};
        List<Integer> result1 = Challenge_02.getSumElements(nums1, 9);
        assertEquals(List.of(0, 1), result1);

        int[] nums2 = {3, 3};
        List<Integer> result2 = Challenge_02.getSumElements(nums2, 6);
        assertEquals(List.of(0, 1), result2);

        int[] nums3 = {3, 3, 9, 11, 4, 1, 7};
        List<Integer> result3 = Challenge_02.getSumElements(nums3, 15);
        assertEquals(List.of(3, 4), result3);
    }

}
