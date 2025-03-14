package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveElement {
    public static void main(String[] args){
        System.out.println(removeElement(new int[]{2,2,2}, 0));
    }

//    0 <= nums.length <= 100
//            0 <= nums[i] <= 50
//            0 <= val <= 100

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0 || nums.length > 100 )return 0;
        if(val < 0 || val > 100 )return 0;

        int auxIndex = 0;
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0 || nums[i] > 50 )return 0;

            if(nums[i] != val){
                System.out.println("entro");
                nums[auxIndex] = nums[i];
                auxIndex++;
            }
        }

        System.out.println(auxIndex);

        return auxIndex;
    }
}
