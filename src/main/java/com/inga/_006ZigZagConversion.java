package com.inga;

/**
 * Created by abing on 2016-11-2.
 */
public class _006ZigZagConversion {
    public static void main(String[] args) {
//        String str ="a b b\nccccccc";
//        System.out.println(getNewString(str));
        String str = "abcddd";
        System.out.println(getZigZag(str , 3));
    }

    public static String getZigZag(String str , int rows){
        if (rows == 1){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int size = 2 * (rows - 1);
        for (int i = 0 ; i < rows ;i++){
            for (int k = i ; k < str.length() ; k+=size) {
                sb.append(str.charAt(k));
                if (i!= 0 && i!=rows-1) {
                    int tmp = k + size - 2 * i;
                    if (tmp < str.length()) {
                        sb.append(str.charAt(tmp));
                    }
                }
            }
        }
        return  sb.toString();

    }

//    public static String getNewString(String str){
//        String[] strs = str.split("\\n");
//        StringBuilder sb = new StringBuilder();
//        int maxLen = 0 ;
//        for (int i = 0 ; i < strs.length ;i++){
//            maxLen = Math.max(maxLen , strs[i].length());
//        }
//        for (int i = 0 ; i < maxLen ;i++){
//            for (int k = 0 ; k < strs.length ;k++){
//                if (i < strs[k].length()) {
//                    char ch = strs[k].charAt(i);
//                    String st = String.valueOf(ch).trim();
//                    sb.append(st);
//                }
//            }
//
//        }
//        return  sb.toString();
//    }

}
