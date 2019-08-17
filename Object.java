package com.java24hours;

class Object {
    
    public Object(String name){
        System.out.println("Passed name is " + name);
    }
    public static void main(String args[]){
        
        Object myPuppy = new Object("Jerry");
    }
}