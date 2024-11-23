package com.awesome.dsa.string;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class SubStrWORepChar {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        char[] chStr = s.toCharArray();

        for(int i = 1; i < chStr.length; i++){
            if(chStr[i] != chStr[i-1]){
                maxLength = maxLength+1;
            }

        }

        return maxLength;
    }
}
