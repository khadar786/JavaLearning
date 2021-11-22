package khadar.javalearning;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver=true;
	    int score=800;
	    int levelCompleted=5;
	    int bonus=100;
		int highscore=calculatescore(gameOver,score,levelCompleted,bonus);
		//int cal2=calculatescore(gameOver,10000,8,200);
		int highScorePosition=calculateHighScorePosition(1500);
		displayHighScorePosition("khadar",highScorePosition);
		highScorePosition=calculateHighScorePosition(900);
		displayHighScorePosition("nagoor",highScorePosition);
		highScorePosition=calculateHighScorePosition(400);
		displayHighScorePosition("nawaz",highScorePosition);
    }

	public static void displayHighScorePosition(String playerName,int highScorePosition){
		System.out.println(playerName+" managed get into position "+highScorePosition+" on the high score table");
	}

	public static int calculateHighScorePosition(int score){
    	if(score>1000){
			return 1;
		}else if(score>500 && score<1000){
			return 2;
		}else if(score>100 && score<500){
			return 3;
		}else {
			return 4;
		}
	}

    public static int calculatescore(boolean gameOver,int score,int levelCompleted,int bonus){
    	int finalscore=0;
    	if(gameOver){
    		finalscore=score+(levelCompleted*bonus);
    		finalscore+=1000;
    		//System.out.println("Your final score was "+finalscore);
			return finalscore;
		}
    	return -1;
	}
}
