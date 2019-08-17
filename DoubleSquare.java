package com.java24hours;

import java.util.*;

class DoubleSquare{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the First Number ");
         int x = input.nextInt();
        System.out.print("\nEnter the next Number ");
        int y = input.nextInt();
        
        double z = Math.sqrt(x) + Math.sqrt(y);
        
        System.out.println("The sum of the Square root of "+ x + " and " + y + " is equal to " + z);
    }
}