package org.example;

public class twoPointer {
    public static boolean isPalindrome(String s) {
        // A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
        // Time complexity O(n), Space complexity O(1)

        char[] sArray = s.toLowerCase().toCharArray();
        int i = 0, j = sArray.length - 1;
        boolean ispalindrome = true;
        for (; i < j; ) {
            while (i < j && !isAlphanumeric(sArray[i])) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(sArray[j])) {
                j--;
            }
            if (sArray[i] == sArray[j]){
                i++;
                j--;
            }else{
                ispalindrome= false;
                break;
            }
        }
        return ispalindrome;
    }

    private static boolean isAlphanumeric(char c) {
        return (c >= 'A' && c < 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c < '9');
    }

    public static boolean isPalindrome1(String s){
        // A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
        // Time complexity O(n), Space complexity O(n)

        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            }
        }
        return str.toString().equalsIgnoreCase(str.reverse().toString());
    }

    public int[] twoSum(int[] numbers, int target) {
        int f=0;
        int l = numbers.length -1;
        while(f<l){
            if(numbers[f] + numbers[l] == target){
                break;

            }else if(numbers[f] + numbers[l] < target){
                f++;
            }else{
                l--;
            }
        }
        return new int[]{numbers[f], numbers[l]};
    }



}