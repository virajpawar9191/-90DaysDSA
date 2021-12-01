package com.DsaBegin;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
            conditionals
               1. if(boolean value T or F){
                        //body of if
                  }
                  else{
                        // body of else
                  }


         */
        Scanner input = new Scanner(System.in);
/*
        System.out.print(" Please Enter Yor Age ::");
        int age = input.nextInt();

        if (age > 18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
 Loops
        for (int i = 1; i <= 10; i++){
            System.out.println(i*29);
        }
*/
        /*
 while loop
        int i = 1;
        while(i <= 10){
            System.out.println( i*28);
            i++;
        }
*/
    /*
 do while loop
        int i = 0;
        do {
            System.out.println("Hey there...");
        }while (i != 0);
*/
        /*
         fibonacci series
         0,1,1,2,3,5,... (t3=t1+t2)
                int t1 = 0,t2=1,t3;
                System.out.println("Enter a number for Fibonacci series::");
                int n = input.nextInt();
                System.out.println("0");
                System.out.println("1");

                for (int i=0;i<n;i++){
                    t3 = t1+t2;
                    t1=t2;
                    t2=t3;
                    System.out.println(t3);
                }
        */

        /*
 count the digit in number
        System.out.print("Enter Your number::");
        int number = input.nextInt();
        System.out.print("Enter the Digit to Count::");
        int digit = input.nextInt();
        int count =0;
        while(number != 0){
            int rem = number%10;
            if (rem == digit){
                count++;
            }
            number= number/10;
        }
        System.out.println("Your Digit found " + count +" times");
*/
        /*
 reverse the number
        System.out.print("Enter Your number:: ");
        int number = input.nextInt();
        int ans =0;
        while(number != 0){
            int rem = number%10;
            number /=  10;
            ans = ans*10 +rem;
        }
        System.out.println(ans);
*/

    }
}
