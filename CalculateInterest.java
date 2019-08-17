package com.java24hours;

class CalculateInterest{
public static void main(String args[]){

    for(int i=1;i<=8;i++){
        double interest = calculateInterest(10000.00,i);
        System.out.println("10000.00 at interest rate of " + i + " is equal to " + interest);
    }
}

public static double calculateInterest(double amount, double interestRate){
    return(amount*(interestRate/100));
}
}