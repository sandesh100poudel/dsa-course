package com;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the day according to serial");

        int fruit = in.nextInt();

        switch (fruit){
            case 1-> System.out.println("monday");
            case 2->System.out.println("tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("thursaday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturaday");
            case 7 -> System.out.println("sunday");
            default->System.out.println("enter number especially integer between 1 to 7");

        }

    }
}
