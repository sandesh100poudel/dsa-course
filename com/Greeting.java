package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
////        System.out.println("hello bishal how are you?");
//       Scanner input =new Scanner(System.in);
//        System.out.println("please enter your roll number if you donot mind");
//       float rollno = input.nextFloat();45

//        int count=1;
//        while(count !=5){
//            System.out.println(count);
//            count++;

        Scanner in=new Scanner(System.in);

        System.out.println("please enter temp in C:");

        float tempC=in.nextFloat();
        float tempF=(tempC+9/5)+32;

        System.out.println("the temperature is faranihit is equal to  "+tempF);
    }

}