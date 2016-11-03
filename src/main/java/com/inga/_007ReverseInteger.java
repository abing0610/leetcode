package com.inga;

/**
 * Created by abing on 2016-11-3.
 */
public class _007ReverseInteger {

    public static void main(String[] args) {
        int i = -11234;

        System.out.println(reverse(i));
    }


    public static  int reverse(int num){
        long ret  =0;

        while (num != 0) {
            ret = ret * 10 + (num%10);
            num = num/10;
        }
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE){
            return 0;
        }

        return  (int)ret;
    }


//    public static  int reverse(int num){
//        int sign = 1;
//        if (num < 0){
//            sign = -1;
//            num = -num;
//        }
//        String str = String.valueOf(num);
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length()-1 ; i >= 0 ;i--){
//            sb.append(str.charAt(i));
//        }
//        num = Integer.valueOf(sb.toString());
//
//        return  sign * num;
//    }
}
