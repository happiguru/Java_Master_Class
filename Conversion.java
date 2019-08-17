package com.java24hours;

class Conversion{
    
    public static void main(String args[]){
        calcFeetAndInchesToCentimeters(12,12);
        
        calcFeetAndInchesToCentimeters(15);
        
       
        
    }
    public static double calcFeetAndInchesToCentimeters(double feets, double inches){
        if(feets<=0 || (inches<=0 || inches>12)){
            System.out.print("Invalid Value");
            return -1;
        } 
             double centimeter = (feets * 12) * 2.54;
            centimeter += inches *2.54;
            System.out.println(feets + " feets "+ inches + " inches "+ " = "+ centimeter + " centimeters");
            return centimeter;
    }    
    
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >0){
            double inchesToFeet = (int) inches/12;
            double remainingInches = (int) inches%12;
            System.out.println(inches +" inches = "+ inchesToFeet + " feets and "+ remainingInches + "inches");
            return calcFeetAndInchesToCentimeters(inchesToFeet,inches);
        }else System.out.print("Invalid Value");
            return -1;
    }
}