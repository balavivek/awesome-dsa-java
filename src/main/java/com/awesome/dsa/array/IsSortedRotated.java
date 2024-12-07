package com.awesome.dsa.array;

public class IsSortedRotated {

    public static void main(String[] args) {

        int[] nums = {2,1,3,4};
        boolean result = check(nums);
        System.out.println("result : "+result);

    }

    public static boolean check(int[] nums) {

        boolean result = false;
        if(nums.length < 2){
            return true;
        }
        int initialValue = nums[nums.length-1];
        for(int i = nums.length-1; i >= 0 ; i--){
            if(nums[nums.length-1] <= initialValue) {
                result = true;
            } else {
                result = false;
            }


        }

        return result;
    }
}
