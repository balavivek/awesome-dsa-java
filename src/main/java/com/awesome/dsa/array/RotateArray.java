package com.awesome.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
//        int[] input = {0,1,2,3,4,5,6,7};
//        int k = 30;

        /**
         * 8 - 3 = 5
         */

        int[] input = {1,2,3};
        int k = 4;

        rotate(input, k);

    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        System.out.println("length: "+length);
        if(length > 1){
            List<Integer> resultList = new ArrayList<>();
            int start = k > length ? length-1 : Math.abs(length - k);

            System.out.println("start: "+start);
            for(int i = start; i < length; i++){
                System.out.println("i: "+i);
                resultList.add(nums[i]);
            }
            for(int i = 0; i < start; i++){
                resultList.add(nums[i]);
            }
            System.out.println("resultList: "+resultList);
            for(int i = 0; i < resultList.size(); i++){
                nums[i] = resultList.get(i);
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
