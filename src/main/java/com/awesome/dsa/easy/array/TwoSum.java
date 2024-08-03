package com.awesome.dsa.easy.array;

import java.util.Arrays;

/**
 * leetcode problem : https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,5,5,11};
        int target = 10;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("twoSum result : "+ Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
