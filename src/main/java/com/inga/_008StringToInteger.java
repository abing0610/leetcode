package com.inga;

/**
 * Created by abing on 2016-11-3.
 */
public class _008StringToInteger {

    public static void main(String[] args) {
        String str ="-123123 ";

        System.out.println(changeStrToInt(str));

    }


    public static int changeStrToInt(String str){
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0 ) {
            return 0;
        }
        int index = 0 ;
        int sign = 1;
        if (str.charAt(index) == '+'){
            index++;
            sign = 1;
        } else if (str.charAt(index) == '-'){
            index++;
            sign = -1;
        }
        int num =0;

        for (;index < str.length() ;index++){
            if (str.charAt(index)<'0' || str.charAt(index) > '9'){
                break;
            }
            num = 10 * num + (str.charAt(index)-'0');
        }

        if (sign * num >Integer.MAX_VALUE) {
            return  Integer.MAX_VALUE;
        }

        if (sign * num < Integer.MIN_VALUE) {
            return  Integer.MIN_VALUE;
        }

        return  sign * num;
    }
}
