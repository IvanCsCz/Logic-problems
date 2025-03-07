package Array;

import java.util.Arrays;
import java.util.Stack;

/*
Number to center

Given an int array (arr) and an int number (num), rearrange the array based on the number,
placing all occurrences of (num) in the center. For practical purposes, consider that the
center of the array is identified by floor(arr.length / 2).

Input: arr = [1,4,3,4,4,5,3,4,7,5,4], num = 4
Output: [1, 3, 5, 4, 4, 4, 4, 4, 3, 7, 5]
*/

public class NumberToCenter {
    public static void main(String args[]){
        System.out.println(Arrays.toString(numberToCenter(new int[]{1,4,3,4,4,5,3,4,7,5,4}, 4)));
    }

    public static int[] numberToCenter(int[] arr, int num){
        if(arr.length == 0) return new int[]{};

        int count = arr.length-1;
        int center = (int)Math.floor(arr.length)/2;
        Stack<Integer> preCenterStack = new Stack<>();
        Stack<Integer> centerStack = new Stack<>();
        Stack<Integer> postCenterStack = new Stack<>();

        for (int i = 0; i< arr.length; i++){
            if(arr[i] != num && i <= center){
                preCenterStack.add(arr[i]);
            }else if(arr[i] != num && i >= center){
                postCenterStack.add(arr[i]);
            }else {
                centerStack.push(arr[i]);
            }
        }

        while (!postCenterStack.isEmpty()){
            arr[count] = postCenterStack.pop();
            count--;
        }
        while (!centerStack.isEmpty()){
            arr[count] = centerStack.pop();
            count--;
        }
        while (!preCenterStack.isEmpty()){
            arr[count] = preCenterStack.pop();
            count--;
        }

        return arr;
    }
}
