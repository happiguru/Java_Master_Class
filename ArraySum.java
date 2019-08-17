package com.java24hours;

class ArraySum{
    
    public static void main(String args[]){
        int my_array[] ={1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        
        for(int i : my_array)
            sum +=i;
        System.out.println("The Sum is "+ sum);
    }
}