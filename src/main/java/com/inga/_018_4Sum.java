package com.inga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abing on 2016-11-21.
 */
public class _018_4Sum {

    public static void main(String[] args) {
        int[] arr = new int[]{1 , 0 , -1 , 0 , -2 , 2};
        int target = 0 ;
        List<List<Integer>> list = getAllSum(arr , target);

        for (List<Integer> is : list) {

            StringBuilder sb = new StringBuilder();

            for (Integer i : is){
                sb.append(i).append(" ");
            }

            System.out.println(sb.toString());


        }


    }


    public static List<List<Integer>> getAllSum(int[] arr , int target){
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length - 3 ;i++){
            if (i != 0 && arr[i] == arr[i-1]){
                continue;
            }
            for (int j = i+1 ; j < arr.length - 2 ;j++){
                if ( j != i+1 && arr[j] == arr[j-1]){
                    continue;
                }
                int left = j+1;
                int right = arr.length - 1;
                while (left < right) {
                    int sum =  arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum < target) {
                        left++;
                    } else if(sum > target){
                        right--;
                    } else {
                        List<Integer> ls = new ArrayList<Integer>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[left]);
                        ls.add(arr[right]);
                        lists.add(ls);
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left-1]){
                            left++;
                        }

                        while (left < right && arr[right] == arr[left+1]){
                            right--;
                        }

                    }
                }
            }
        }


        return  lists;
    }

}
