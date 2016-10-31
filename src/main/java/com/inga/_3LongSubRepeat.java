package com.inga;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by abing on 2016-10-31.
 */
public class _3LongSubRepeat {

    public static void main(String[] args) {

        String str = "aabca";
        System.out.println(getMaxRepeat(str));

    }

    public static int getMaxRepeat(String str){

        int ans = 0 ;
        for (int i = 0 ; i < str.length() ; i++) {
            for (int j = i+1 ; j <= str.length() ; j++){
                if (getMaxLen( str , i , j)){
                    ans = Math.max(ans , j - i);
                }
            }
        }
        return ans;
    }

    public  static  boolean getMaxLen(String str , int start , int end){

        Set<Character> set = new HashSet<Character>();
        for (int i = start ; i < end ; i++){
            char ch  = str.charAt(i);
            if (set.contains(ch)) {
                return  false;
            }
            set.add(ch);
        }
        return  true;
    }
}
