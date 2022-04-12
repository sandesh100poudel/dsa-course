package com;

public class overloading {
    public static void main(String[] args) {
        int ans = sum(23,56, 89);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a+b;

    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
