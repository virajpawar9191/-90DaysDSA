package com.DsaBegin;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Functions {
    public static void main(String[] args) {
//        fun();
//        fun(10);
//        fun(12,23);
//        sum();
        Scanner sc =new Scanner(System.in);
        out.print("Enter Number to check is armstrong or not : ");
        int n = sc.nextInt();
        boolean ans = armstrong(n);
        out.println(ans);
    }

    // varArgs used when we don't know uch args are passed
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }

    // function overriding
    static void fun(){
        out.println("I am with no arguments");
    }
    static void fun(int a){
        out.println("I am with this one arg " + a);
    }
    static void fun(int a, int b){
        out.println("i am with this two args "+a+ " "+b);
    }
/*
    static  void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int ans = num1 + num2;
        System.out.println("The sum is: "+ans);
    }

*/

    // checking prime or not
//    static boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
//        int c = 2;
//        while (c*c <= n) {
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//
//        return true;
//    }
        // Printing all 3 digit armstrong numbers
    static boolean armstrong(int n){
        int org = n;
        int sum = 0;
        while (n > 0){
            int rem = n%10;
            sum+= rem*rem*rem;
            n /= 10;
        }
        return sum == org;
    }
    /*    syntax
            return_type fun_name(arg){
                //body
                return statement;
            }
        */
}
