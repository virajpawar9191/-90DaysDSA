package com.DsaBegin;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Fruit Name:: ");
        String fruit = input.next();

/*
        switch (fruit){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "grapes":
                System.out.println("A small fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
*/
        /*
 Enhanced Switch Case
        switch (fruit){
            case "mango" -> System.out.println("King of fruits");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("please enter a valid fruit");
        }
*/
        

    }
}
