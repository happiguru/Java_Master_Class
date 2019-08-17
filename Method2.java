package com.java24hours;
class Method2 {
    
    public static void main(String[] args){
        
        int highScore = calculateScore(true,800,20,300);
        int position = calculateHighScorePosition(highScore);
        displayHighScorePosition("Stanley", position);
       // System.out.println("The Final Score is : "+ highScore);
        
        highScore = calculateScore(true,10,10,10);
        position = calculateHighScorePosition(highScore);
        displayHighScorePosition("Larissa", position);
        //System.out.println("The Final Score is : "+ highScore);
    }
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score +(levelCompleted*bonus);
            finalScore += 0;
            return finalScore;
        }else return -1;
    }
   
        
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
    
     public static int calculateHighScorePosition(int highScore){
        
       int position;
        if(highScore>=1000){
             position = 1;
             return position;
        }else if(highScore>=500){
            position =2;
            return position;
        }else if(highScore>=100){
            position = 3;
            return position;
        }else position = 4;
        return position;
}
     
}
