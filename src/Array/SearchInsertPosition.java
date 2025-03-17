package Array;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.

Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4
*/
public class SearchInsertPosition {
    public static void main(String[] args){
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int auxIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(!(nums[i] != target && nums[i] < target)){
                auxIndex=i;
                break;
            }else if(nums.length - 1 == i) {
                auxIndex=i + 1;
            }
        }
        return auxIndex;
    }
}
