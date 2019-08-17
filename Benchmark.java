package com.java24hours;

class Benchmark{
    
    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        long endTIme = startTime + 60000;
        long index = 0;
        while(true){
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if(now>endTIme){
                break;
            }
            index++;
        }
        System.out.println(index + " loops perfrom in 1 minutes");
    }
}