package com.java24hours;

class SpaceRemover{
    
    public static void main(String args[]){
        String mostFamous = "Rudolph the red-Nosed Reindeer";
        char[] mfl = mostFamous.toCharArray();
            for(int dex=0;dex<mfl.length;dex++){
                char current = mfl[dex];
                if(current!= ' '){
                    System.out.print(current);
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
    }
}