package com.java24hours;

class MinutesToYearAndDays{
    public static void main(String args[]){
        minutesToYearAndDays(67892537L);
    }
    public static void minutesToYearAndDays(long minutes){
        long years = (long) (minutes/(60*24*365));
        int days = (int) (minutes/60/24)%365;
        
        System.out.println(minutes +" minutes is equal to : " + years + " years and "+ days + " days");
    }
}