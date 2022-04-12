package com;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        System.out.println("you sum of two number is "+say(34,56));


    }
    static Integer say(int a, int b){
      Scanner in = new Scanner(System.in);
        System.out.print("Enter first number?  ");
       a =in.nextInt();
        System.out.print("Enter secound number?  ");
       b = in.nextInt();
        int sum=a+b;
//
//        System.out.println(sum);
        return sum;

    }
}
