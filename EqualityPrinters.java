package com.java24hours;

class EqualityPrinters{
    
    public static void main(String args[]){
        printEqual(1,2,3);
        printEqual(10,10,10);
        printEqual(10,5);
        printEqual(10,10);
    }
    public static void printEqual(int a, int b,int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }
        else if(a==b && a==c && b==c){
            System.out.println("All Numbers are equal or the same");
        }
        else
        {
            System.out.println("Numbers are Different");
        }
    }
     public static void printEqual(int a, int b){
        if(a<0 || b<0){
            System.out.println("Invalid Value");
        }
        else if(a==b){
            System.out.println("All Numbers are equal or the same");
        }
        else
        {
            System.out.println("Numbers are Different");
        }
    }
}