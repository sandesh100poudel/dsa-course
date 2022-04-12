package com;

import java.util.Scanner;

public class Nasted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int business = in.nextInt();
        String classic = in.next();

//        switch (business){
//            case 1-> System.out.println("people love to be part");
//            case 2-> System.out.println("other people");
//            case 3 ->{
//                System.out.println("enter some integer number");
//                switch(classic){ case "it" -> System.out.println("heyyyy");
//                    case "management" -> System.out.println("management departement");}
//            }
//            default -> System.out.println("put integer");
//        }

        String great=in.next();

        switch(business){
            case 1:
                System.out.println("its nice to cooperate");
                break;
            case 2:
                System.out.println("its great");
                break;
            case 3:
            {
                switch (classic){
                    case "it":
                        System.out.println("it related to java programming");
                        break;
                    case "management":{
                        switch (great){
                            case "account":
                                System.out.println("it focus on accounting department");
                                break;
                            case "finanical":
                                System.out.println("it focus on fundamental of finance");
                                break;
                            default:
                                System.out.println("please enter some valid thing related to management");
                        }
                    }
                        break;
                    default:
                        System.out.println("no such option");

                }}
                break;
                default:
                    System.out.println("enter some integer");


        }


    }
}
