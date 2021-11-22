package khadar.javalearning;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver =true;
        int score =0;
        int levelCompleted=1;
        int bonus=10;

        int highScore=calculateScore(gameOver,score,levelCompleted,bonus);
        int position=calculateHighScorePosition(highScore);
        displayHighScorePosition("khadar",position);
        //System.out.println("Your final score was :"+highScore);
        /*if(gameOver){
            int finalScore =score +(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score was :"+finalScore);
        }*/

        score =10000;
        levelCompleted=8;
        bonus=200;
        highScore=calculateScore(gameOver,score,levelCompleted,bonus);
        position=calculateHighScorePosition(highScore);
        displayHighScorePosition("basha",position);
        //System.out.println("Your final score was :"+highScore);
        /*if(gameOver){
            int finalScore =score +(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final score was :"+finalScore);
        }*/
    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        if(gameOver){
            int finalScore =score+(levelCompleted*bonus);
            finalScore+=100;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName+" managed to get into position "+highScorePosition+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        int position=0;
        if(score>1000){
            position=1;
        }else if(score>500 && score<1000){
            position=2;
        }else if(score>100 && score<500){
            position=3;
        }else{
            position=4;
        }
        return position;
    }
}
