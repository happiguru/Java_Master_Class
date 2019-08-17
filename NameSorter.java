package com.java24hours;
import java.util.*;
class NameSorter{
    
    public static void main(String args[]){
        String names[] ={"Glimmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
        System.out.println("The original order is ");
        for(int i =0; i<names.length;i++){
            System.out.println(i+ " :" + names[i]);
        }
        System.out.println();
        Arrays.sort(names);
        System.out.println("The New order is ");
        for(int i=0;i<names.length;i++){
           System.out.println(i + " :" + names[i]);
        }
        System.out.println();
    }
}