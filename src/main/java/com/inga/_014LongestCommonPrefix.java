package com.inga;

/**
 * Created by abing on 2016-11-4.
 */
public class _014LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"123" , "123" , "111123"};
        System.out.println(longestCommonPrefix(strs));

    }


    public static  String longestCommonPrefix(String[] strs){

        if (strs.length == 0 ) {
            return null;
        }
        String prefix = strs[0];
        for (int i = 1 ; i < strs.length ;i++) {
            while (strs[i].indexOf(prefix) == -1){
                prefix = prefix.substring(0 , prefix.length() - 1);
                if (prefix.length() == 0) {
                    return null;
                }
            }

        }
        return  prefix;
    }
}
