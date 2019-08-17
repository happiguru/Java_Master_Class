package com.java24hours;

import java.util.Scanner;

class InputAddition{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Input the first Number: ");
        int num1 = input.nextInt();
        System.out.print("\n Input the second Number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}