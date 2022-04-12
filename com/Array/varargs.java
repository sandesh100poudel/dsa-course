package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        form(34,45, 78);
        form("name", "bishal", "sahit", "rohit", "kiran");

    }
    static void form(int ...v){
        System.out.println(Arrays.toString(v));

    }
   static void form(String ...v){
        System.out.println(Arrays.toString(v));
   }
}


