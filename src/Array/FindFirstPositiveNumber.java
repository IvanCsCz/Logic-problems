package Array;

import java.util.Arrays;

/*
Given an unsorted array of integers, find the first positive number (greater than 0) that is missing in the sequence.

Input: [3,4,-1,1]
Output: 2

Input: [1,2,0]
Output: 3

Input: [3,4,-1,1,2,7,-4,10]
Output: 5
*/

public class FindFirstPositiveNumber {
    public static void main(String[] args){
        int[] arr = new int[]{3,4,-1,1,2,7,-4,10};
        int result = findFirstPositiveNumber(arr);
        System.out.println(result);
    }

    public static int findFirstPositiveNumber(int[] arr){
        if(arr.length == 0) return 0;

        int j = 0;
        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++){
            if(arr[j] + 1 == arr[i] || arr[j] + 1 <= 0){
                j++;
            } else {
                break;
            }
        }
        return arr[j] + 1;
    }
}
