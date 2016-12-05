package com.inga;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abing on 2016-10-31.
 */
public class _001TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        int [] ss =  twoSum(nums , 6);
//        int[]  ss = twoSum2(nums , 10);
        for (int i = 0 ; i < ss.length ;i++){
            System.out.print(ss[i] + " ");
        }
    }



    public static int[] twoSum(int[] nums , int target){

        for (int i = 0 ; i < nums.length-1 ;i++) {
            for (int k = i + 1;k < nums.length;k++) {
                if ((nums[i] + nums[k]) == target) {
                    return new int[] {++i , ++k};
                }
            }
        }

        throw new RuntimeException("the ints sum is no targeet");
//        return null;
    }












//    public static int[] twoSum2(int[] nums , int target){
//        Map<Integer , Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0 ; i < nums.length ; i++){
//            if (map.containsKey( target - nums[i])) {
//                return  new int[]{map.get(target - nums[i])  + 1  , i+1};
//            }
//            map.put(nums[i] , i);
//        }
//        throw new RuntimeException("array two num sum no target");
//    }

//    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length ;i++){
//            for(int j=i+1 ; j <= nums.length ;j++){
//                if(nums[j] == (target - nums[i])){
//                    return new int[]{i+1,j+1};
//                }
//            }
//        }
//
//        throw  new RuntimeException("array two sum  is no target");
//
//    }
}
