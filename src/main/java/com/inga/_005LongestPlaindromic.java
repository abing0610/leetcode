package com.inga;

/**
 * Created by abing on 2016-11-2.
 */
public class _005LongestPlaindromic {
    public static void main(String[] args) {
        String str = "abccbaaddadaadadaaaa";
        System.out.println(getPlaindromic(str));
//        System.out.println(str.substring(2 , 4));
    }


    public  static String getPlaindromic(String str){

        int start = 0 , end = 0;
        for (int i = 0; i< str.length();i++){
            int len1 = getPlainTheNum(str , i , i);
            int len2 = getPlainTheNum(str , i , i+1);
            int len = Math.max(len1 , len2);
            if (len > (end -start)) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }

        return str.substring(start , end+1);

    }

    public static int getPlainTheNum(String str , int left , int right){
        int L = left , R = right;
        while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)){
            L--;
            R++;
        }
        return R - L -1;
    }

//    public static String getPlaindromic(String str){
//        String longest = str.substring(0 , 1);
//        for (int i = 0 ; i < str.length() ;i++){
//            String s1 = getTheNum(str , i , i);
//            if (s1.length() > longest.length()) {
//                longest = s1;
//            }
//            s1 = getTheNum(str , i , i+1);
//            if (s1.length() > longest.length()) {
//                longest =s1;
//            }
//        }
//        return  longest;
//    }
//
//    public static String getTheNum(String str , int left , int right){
//        while ( left >= 0  && right < str.length() && str.charAt(left) == str.charAt(right)){
//            left--;
//            right++;
//        }
//        return str.substring(left + 1 , right);
//
//    }
}
