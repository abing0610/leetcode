package com.inga;

public class Pager {

    public static void main(String[] args) {

        int n = 2;

        exceute(n  , 1 , true);
    }

    public static void exceute(int n , int i , boolean b){
        if ( i > n ){
            return;
        }
        exceute(n, i+1 , true);

        System.out.println(b ? "down" : "up");

        exceute(n, i+1 ,  false);
    }


}
