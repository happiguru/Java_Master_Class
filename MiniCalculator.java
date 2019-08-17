package com.java24hours;

import java.util.*;
class MiniCalculator{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter the First Number : ");
        int x = input.nextInt();
        System.out.println("\n Enter the Second number : ");
        int y = input.nextInt();
        System.out.println(x + " + "+ y + " = " + (x+y));
        System.out.println(x + " - "+ y + " = " + (x-y));
        System.out.println(x + " x "+ y + " = " + (x*y));
        System.out.println(x + " / "+ y + " = " + (x/y));
        System.out.println(x + " mod "+ y + " = " + (x%y));
        
        
    }
}