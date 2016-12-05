package com.inga;

/**
 * Created by abing on 2016-11-4.
 */
public class _011ContainerMostWater {

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7};

        System.out.println(maxArea(ints));

    }


    public static int maxArea(int[] height){
        int left = 0 , right = height.length - 1 , maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea , Math.min(height[left] , height[right]) * (right - left));
            if (height[left] < height[right]){
                left ++;
            } else {
                right--;
            }

        }

        return  maxArea;
    }
}

