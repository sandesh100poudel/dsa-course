package com;

public class scoping {
    public static void main(String[] args) {
        int a =23;
        {
            a=78;
            int c =99;



        }
        System.out.println(a);
        for(int i=34; i<60; i=i+6){
            System.out.print(i);
        }
    }

}
