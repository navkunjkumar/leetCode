package org.example;

import java.util.Arrays;

public class Main {
    ArrayProblems arrayProblems = new ArrayProblems();
    public static void main(String[] args) {
        System.out.println(ArrayProblems.hasDuplicate(new int[]{1,2,2,4}));
        System.out.println(ArrayProblems.isAnagram("Nashcar", "CarNash"));
        System.out.println(Arrays.toString(ArrayProblems.twoSum(new int[]{1,3,2,6,7}, 8)));
    }
}