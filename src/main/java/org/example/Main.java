package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    ArrayProblems arrayProblems = new ArrayProblems();
    public static void main(String[] args) {
        /*System.out.println(ArrayProblems.hasDuplicate(new int[]{1,2,2,4}));
        System.out.println(ArrayProblems.isAnagram("Nashcar", "CarNash"));
        System.out.println(Arrays.toString(ArrayProblems.twoSum(new int[]{1,3,2,6,7}, 8)));
        System.out.println(ArrayProblems.groupAnagram1(new String[]{"act","pots","tops","cat","stop","hat"}));
        System.out.println(twoPointer.isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(BinarySearch.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3)); */
        System.out.println(SlidingWindow.maxProfit(new int[]{7,1,5,3,6,4}));

    }
}