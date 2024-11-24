package com.awesome.dsa.array;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] input = {1,2,3,1};
        boolean result = containsDuplicateUsingHashSet(input);
        System.out.println("result : "+result);
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    isDuplicate = true;
                    break;
                }
            }
        }
        return isDuplicate;
    }

    public static boolean containsDuplicateUsingHashSet(int[] nums) {
        boolean isDuplicate = false;
        HashSet<Integer> elements = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(elements.contains(nums[i])){
                isDuplicate = true;
                break;
            } else {
                elements.add(nums[i]);
            }
        }
        return isDuplicate;
    }
}
