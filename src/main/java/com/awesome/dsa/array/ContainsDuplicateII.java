package com.awesome.dsa.array;

import java.util.HashMap;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int k= 2;
        int[] input = {1,2,3,1,2,3};
        boolean result = containsDuplicateUsingHashMap(input, k);
        System.out.println("result : "+result);

    }

    public static boolean containsDuplicate(int[] nums, int k) {
        boolean isDuplicate = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int abs = Math.abs(i - j);
                if(nums[i] == nums[j] && abs <= k){
                    isDuplicate = true;
                    break;
                }
            }
        }
        return isDuplicate;
    }

    public static boolean containsDuplicateUsingHashMap(int[] nums, int k) {
        boolean isDuplicate = false;
        HashMap<Integer, Integer> elements = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int abs = elements.get(nums[i]) != null ? Math.abs(elements.get(nums[i]) - i) : 0;
            if( elements.get(nums[i]) != null  && abs <= k){
                isDuplicate = true;
                break;
            } else {
                elements.put(nums[i], i);
            }
        }
        return isDuplicate;
    }
}
