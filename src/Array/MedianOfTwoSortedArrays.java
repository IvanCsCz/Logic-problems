package Array;

import java.util.Arrays;
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
*/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] arrMerged=new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,arrMerged,0,nums1.length);
        System.arraycopy(nums2,0,arrMerged,nums1.length,nums2.length);
        Arrays.sort(arrMerged);

        int mid = arrMerged.length/2;
        boolean isEven = arrMerged.length % 2 == 0;

        if(isEven){
            return (arrMerged[mid - 1] + arrMerged[mid]) / 2D;
        }

        return arrMerged[mid];
    }
}
