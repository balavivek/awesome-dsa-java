package com.awesome.dsa.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println("result : "+result);

    }

    public static int removeDuplicates_bruteForce(int[] nums) {
        Set<Integer> resultSets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            resultSets.add(nums[i]);
        }
        System.out.println("resultSets : "+resultSets.toString());
        int k = resultSets.size();
        int i = 0;
        for(int r : resultSets){
            nums[i++] = r;
        }
        System.out.println("nums : "+ Arrays.toString(nums));
        return k;

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
