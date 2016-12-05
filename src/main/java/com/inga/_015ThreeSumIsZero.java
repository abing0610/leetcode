package com.inga;

import java.util.*;

/**
 * Created by abing on 2016-11-6.
 */
public class _015ThreeSumIsZero {

    public  static List<List<Integer>> lists = new ArrayList<List<Integer>>();

    public static void main(String[] args) {

        int[] sums = {-1,-1,2,3,111};
        threeSum(sums);
        for (List<Integer> li : lists) {
            for (Integer i : li) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }


    public static List<List<Integer>> threeSum(int[] nums){

        if (nums == null || nums.length <3 ) {
            return lists;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0 ; i < len -2 ; i++) {
            if ( i == 1 && nums[i] == nums[i-1]) {
                continue;
            }
            find(nums , i+1 , len-1  , nums[i]);
        }
        return lists;
    }


    public static void  find(int[] nums , int begin,  int end , int target){
        int l = begin, r = end;
        while (l < r) {
            if (target + nums[l] + nums[r] == 0 ) {
                List<Integer> ans = new ArrayList<Integer>();
                ans.add(target);
                ans.add(nums[l]);
                ans.add(nums[r]);
                lists.add(ans);
                while (l < r && nums[l] == nums[l+1]) {
                    l++;
                }
                while (l<r && nums[r] == nums[r-1]) {
                    r--;
                }
                l++;
                r--;
            } else if (target + nums[l] + nums[r] < 0){
                l++;
            } else {
                r--;
            }

        }

    }

//    public static List<List<Integer>> threeSum(int[] nums){
//
//        List<List<Integer>> lists = new ArrayList<List<Integer>>();
//
//
//        for (int i = 0 ; i < nums.length ;i++) {
//            Map<Integer , Integer> map = new HashMap<Integer, Integer>();
//            map.put(i , nums[i]);
//            Map<Integer , Integer> sets = new HashMap<Integer, Integer>();
//            for (int k = 0 ; k<nums.length ;k++) {
//                if (!map.containsKey(k)){
//                    if (sets.containsKey( (-1) * ( map.get(i) +  nums[k]) )){
//                        List<Integer> innerList = new ArrayList<Integer>();
//                        innerList.add(k);
//                        innerList.add(i);
//                        innerList.add(sets.get((-1) * ( map.get(i) +  nums[k]) ));
//                        //添加到list当中去
//                        lists.add(innerList);
//                    }
//                    sets.put(nums[k] , k);
//                }
//            }
//
//        }
//
//
//        return null;
//    }

}
