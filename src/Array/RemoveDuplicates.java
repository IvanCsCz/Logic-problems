package Array;
/*
Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements
in nums.

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5
*/
public class RemoveDuplicates {
    public static void main(String[] args){
        int result = removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
