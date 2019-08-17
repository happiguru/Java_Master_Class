package com.java24hours;
import java.util.*;
class ArrayInputSum{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

int number[] = new int[5];
int sum = 0;
System.out.print("Enter your numbers: ");

for (int i = 0; i < number.length; i++) {
number[i] = input.nextInt();
sum += number[i];
}
System.out.println("Sum is: " + sum);
    }
}