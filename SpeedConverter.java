package com.java24hours;

class SpeedConverter{
    
    public static void main(String[] args){
        int kilometersPerHour = 67;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
      
      }
      public static long toMilesPerHour(double kiloMetersPerHour){
            if(kiloMetersPerHour<0){
                System.out.println("Invalid Value");
                return -1;
            }
                long milesPerHour = Math.round(kiloMetersPerHour/1.609);
                return milesPerHour;
            
        } 
        
        public static void printConversion(double kiloMetersPerHour){
           
            if(kiloMetersPerHour<0){
                System.out.println("Invalid Value");
            }else{
           long milesPerHour = toMilesPerHour(kiloMetersPerHour);
           
           System.out.println(kiloMetersPerHour + " km/h"+ " =" + milesPerHour + "mi/h");
            }
        }
}