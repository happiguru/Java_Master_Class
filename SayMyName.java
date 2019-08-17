package com.java24hours;

import java.util.*;
public class SayMyName{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print(System.in);
        System.out.print("\nInput your Fist Name: ");
        String fname = input.next();
        System.out.print("\nInput your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello, your Full Name is \n" +fname + " " +lname);
    }
}