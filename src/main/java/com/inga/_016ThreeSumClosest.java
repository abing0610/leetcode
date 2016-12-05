package com.inga;

import java.util.Arrays;

/**
 * Created by abing on 2016-11-6.
 */
public class _016ThreeSumClosest {

    public static int minValue = Integer.MAX_VALUE;
    public static int reslt = 0;
    public static void main(String[] args) {

        int[] sums = {-1, 2 , 1 , -4};

        System.out.println(threeSumClosest(sums , 1));

    }


    public static int threeSumClosest(int[] sums , int target) {

        if (sums == null || sums.length <3){
            return reslt;
        }
        Arrays.sort(sums);
        int len = sums.length;
        for (int i = 0 ; i < len  ; i++) {
            if (i > 0 && sums[i] == sums[i-1]){
                continue;
            }
            find(i , sums  , sums[i] , target  ) ;
        }
        return  reslt;
    }

    public static void find(int i , int[] sums , int target , int res){
        int l = i +1 ;
        int r =sums.length -1;
        while (l < r ) {
            if ((sums[l] + target + sums[r]  - res) < minValue) {
                minValue = Math.abs(sums[l] + target + sums[r] - res);
                reslt = sums[l] + target + sums[r];
                while (l < r && sums[l] == sums[l+1]) {
                    l++;
                }
                while (l < r && sums[r] == sums[r-1]){
                    r--;
                }
                l++;
                r--;
            } else if ((sums[l] + sums[r] + target) > res) {
                r--;
            } else{
                l++;
            }

        }


    }
}
