package com.java.oop.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArithmeticException

//        int num1;
//        int num2;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        num1 = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        num2 = scanner.nextInt();
//
//        try {
//            int result = num1 / num2;
//            System.out.println(result);
//        }catch (ArithmeticException e){
//            System.out.println("can not divide by zero");
//        }


        // NegativeArraySizeException

//        try {
//            int[] arr = new int[-5];
//        }catch (NegativeArraySizeException e){
//            System.out.println("negative array size " + e.getMessage());
//        }


        //ArrayIndexOutOfBoundsException

//        int[] arr2 = new int[4];
//        try {
//            arr2[6] = 27;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }

        //finally block

        try {
            int[] arr3 = new int[-5];
        } catch (NegativeArraySizeException e){
            System.out.println("Negative Array Size " +e.getMessage());
        } finally {
            System.out.println("Finally Block Executes.....");
        }
        System.out.println("Program Completed...");
    }

}
