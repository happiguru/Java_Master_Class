package com.java24hours;
class Method1 {
    
    public static void main(String[] args){
        
        calculateScore(true,800,20,300);
        calculateScore(true,100,10,300);
    }
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score +(levelCompleted*bonus);
            finalScore += 2000;
            System.out.println("The final score is: "+ finalScore);
            return finalScore;
        }else return -1;
    }
}