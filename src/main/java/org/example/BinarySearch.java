package org.example;

public class BinarySearch {
    /*
    int l =0, r= nums.length -1;
    int mid
    check num is within the range of sorted nums
    mid = l+ r / 2
    loop till l<r
    if the target is greter than mid, l = mid
    else if r = mid
    else return mid;

    loop end
    return -1

     */

    public static int search(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;
        int mid;
        while (l<=r)
        {
            mid = (l+r)/2;
            if(target>nums[mid]){
                l = mid+1;
            }else if (target < nums[mid]){
                r= mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r= matrix.length-1;
        int rl = matrix[0].length-1;
        int mid;
        int res= -1;
        while (l<=r){
            mid = (l+r)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][rl]){
                res = search(matrix[mid], target);
                break;
            }else if(target < matrix[mid][0]){
                r= mid-1;
            }else{
                l= mid+1;
            }
        }
        return res==-1? false:true;

    }
}
