package com;

public class shadowing {
    static int n=90;

    public static void main(String[] args) {
        System.out.println(n);
        int n=40;
        System.out.println(n);
        fun();

    }
    static void fun(){
        System.out.println(n);
    }
}
