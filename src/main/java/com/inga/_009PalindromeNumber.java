package com.inga;

/**
 * Created by abing on 2016-11-3.
 */
public class _009PalindromeNumber {

    public static void main(String[] args) {
//        System.out.println(Math.pow(10 , 2));
        int x = 1212121;
        System.out.println(isPlaindrome(x));
    }


    public static boolean isPlaindrome(int x){
        if (x == 0){
            return  true;
        }

        int realX = x;
        int n = 0 ;
        while (x != 0) {
            x = x/10;
            n++;
        }
        if (n == 1) {
            return true;
        }

        for (int i = 0 ; i < n ;i++){
            int test1 = (realX % (int) Math.pow(10 , i+1))/(int)Math.pow(10 ,i);
            int test2 = (realX % (int) Math.pow(10 , n-i)) / (int)Math.pow(10 ,n-i-1);
            if (test1 != test2) {
                return false;
            }
        }

        return  true;
    }
}
