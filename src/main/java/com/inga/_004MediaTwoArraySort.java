package com.inga;

import javax.print.attribute.standard.Media;

/**
 * Created by abing on 2016-11-1.
 */
public class _004MediaTwoArraySort {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        int n = nums1.length + nums2.length;
//        System.out.println(getMediaTwoSort(nums1 , nums2));
        if ((nums1.length + nums2.length) % 2 ==1){
            System.out.println(getMediaTwoSort(nums1 , 0 , nums2 , 0 , n / 2 +1));
        }else{
            double d1 = getMediaTwoSort(nums1 , 0 , nums2 , 0 ,n/2);
            double d2 = getMediaTwoSort(nums1 , 0 , nums2 , 0 , n/2 +1);
            System.out.println((d1 + d2) / 2);

        }

    }


    /**
     * find the k num
     * @param nums1
     * @param A_start
     * @param nums2
     * @param B_start
     * @param k
     * @return
     */
    public static int  getMediaTwoSort(int[] nums1 ,  int A_start , int[] nums2 , int B_start , int k){

        if (A_start >= nums1.length) {
            return nums2[B_start + k -1];
        }
        if (B_start >= nums2.length) {
            return  nums1[A_start + k -1];
        }
        if (k == 1) {
            return Math.min(nums1[A_start] , nums2[B_start]);
        }

        int A_key = A_start + k/2 -1 < nums1.length ? nums1[A_start + k/2 -1] : Integer.MAX_VALUE;
        int B_key = B_start + k/2 -1 < nums2.length ? nums2[B_start + k/2 -1] : Integer.MAX_VALUE;

        if (A_key < B_key) {
            return getMediaTwoSort(nums1 , A_start + k/2 , nums2 , B_start , k - k/2 );
        } else {
            return getMediaTwoSort(nums1 , A_start , nums2 , B_start + k/2 , k-k/2);
        }

    }
}
