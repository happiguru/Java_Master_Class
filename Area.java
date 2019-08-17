package com.java24hours;
//import java.util.*;
class Area{
    
    public static void main(String args[]){
        double pi = Math.PI;
        
        double radius = 7.5;
        double root = (radius*radius);
        double area = pi*root;
        double perimeter = 2*pi*radius;
       
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
    }
}