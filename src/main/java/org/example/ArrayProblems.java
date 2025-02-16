package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayProblems {

    // Contains Duplicate - Solution with HashSet
    public static boolean hasDuplicate(int[] nums){
        HashSet<Integer> setNums = new HashSet<>();
        for(int i : nums){
            if(setNums.contains(nums[i-1])){
                return true;
            }setNums.add(nums[i-1]);
        }
        return false;
    }

    // Valid Anagram
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] store = new int[26];
        s= s.toLowerCase();
        t= t.toLowerCase();
        for(int i =0; i< s.length(); i++){
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }
        for(int i=0; i<store.length; i++){
            if(store[i] != 0) return false;
        }
        return true;
    }

    // Two Sum
    public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hashmap = new HashMap();
            for(int i=0; i<nums.length; i++){
                int diff = target - nums[i];
                if(hashmap.containsKey(diff) && hashmap.get(diff) != i){
                    return new int[]{hashmap.get(diff),i};
                }
                hashmap.put(nums[i], i);
            }
            return new int[]{};
    }


}
