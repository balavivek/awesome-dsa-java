package com.awesome.dsa.array;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = getSecondLargest(arr);
        System.out.println("result : " + result);

    }

    public static int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] != max
                    && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
