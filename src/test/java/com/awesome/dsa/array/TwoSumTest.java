package com.awesome.dsa.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testCaseExample1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void testCaseExample2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedResult = {1 , 2};

        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void testCaseExample3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,3};
        int target = 6;
        int[] expectedResult = {0, 1};

        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expectedResult, result);
    }


}
