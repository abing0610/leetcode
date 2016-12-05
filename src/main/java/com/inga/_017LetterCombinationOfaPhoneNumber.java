package com.inga;

import org.omg.CORBA.portable.ValueOutputStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abing on 2016-11-6.
 */
public class _017LetterCombinationOfaPhoneNumber {

    public static void main(String[] args) {

        List<String> strings = letterCombination("23");
        for (String str : strings) {
            System.out.println(str);
        }

    }




    public static List<String> letterCombination(String digits){

        List<String> result = new ArrayList<String>();

        String[] map = new String[] {
                "" ,"" , "abc" , "def" ,"ghi",
                "jkl","mno","pqrs","tuv","wxyz"
        };
        char[] tmp = new char[digits.length()];

        find(digits, 0, tmp, map, result);


        return result;
    }

    public static void find(String digits ,int index, char[] tmp , String[] map , List<String> result){
        if (index == digits.length()) {
            result.add(new String(tmp));
            return;
        }
        char tmpChar = digits.charAt(index);

        for (int i = 0 ; i < map[tmpChar-'0'].length();i++){
            tmp[index] = map[tmpChar-'0'].charAt(i);
            find(digits , index+1 , tmp , map , result);
        }



    }






























    public static List<String> letterCombinatons(String digits){
        List<String> res = new ArrayList<String>();

        String[] map = new String[]{
                "" , "" , "abc" ,"def" , "ghi",
                "jkl","mno","pqrs","tuv","wxyz"
        };

//        char[] tmp = new char[digits.length()];
//        rec(digits , 0 ,tmp , map , res);

        return  res;
    }







//    public static void  rec(String digits , int index , char[] tmp , String[] map , List<String> result) {
//
//        if (index ==  digits.length()){
//            result.add(new String(tmp));
//            return;
//        }
//        char tmpChar = digits.charAt(index);
//        for (int i = 0 ; i < map[tmpChar-'0'].length() ;i++){
//            tmp[index] = map[tmpChar-'0'].charAt(i);
//            rec(digits , index+1 , tmp , map , result);
//        }
//
//    }
}
