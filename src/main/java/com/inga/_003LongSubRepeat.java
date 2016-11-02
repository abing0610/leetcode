package com.inga;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by abing on 2016-10-31.
 */
public class _003LongSubRepeat {

    public static void main(String[] args) {

        String str = "aaab";
        System.out.println(getMaxRepeat(str));     //1


    }

    public static int getMaxRepeat(String str){

        int ans = 0 ;
        int len = str.length();
        Map<Character , Integer> map = new HashMap<Character, Integer>();
        int i , j;
        for (i = 0 , j = 0 ; j < len ; j++){

            if (map.containsKey(str.charAt(j))) {
                i = Math.max(i , map.get(str.charAt(j)));
            }
            ans  = Math.max(ans , j-i+1);
            map.put(str.charAt(j) , j+1);
        }
        return  ans ;
    }

//    public static int getMaxRepeat(String str){
//
//        int len = str.length();
//        Set<Character> set = new HashSet<Character>();
//        int i = 0 , j = 0 , ans = 0;
//        while (j < len && i < len ) {
//
//            char ch = str.charAt(j);
//            if (!set.contains(ch)){
//                set.add(str.charAt(j++));
//                ans = Math.max(ans , j- i );
//            } else {
//                set.remove(str.charAt(i++));
//            }
//        }
//        return ans;
//    }

//    public static int getMaxRepeat(String str){
//
//        int ans = 0 ;
//        for (int i = 0 ; i < str.length() ; i++) {
//            for (int j = i+1 ; j <= str.length() ; j++){
//                if (getMaxLen( str , i , j)){
//                    ans = Math.max(ans , j - i);
//                }
//            }
//        }
//        return ans;
//    }
//
//    public  static  boolean getMaxLen(String str , int start , int end){
//
//        Set<Character> set = new HashSet<Character>();
//        for (int i = start ; i < end ; i++){
//            char ch  = str.charAt(i);
//            if (set.contains(ch)) {
//                return  false;
//            }
//            set.add(ch);
//        }
//        return  true;
//    }
}
