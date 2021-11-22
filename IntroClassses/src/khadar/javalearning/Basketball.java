package khadar.javalearning;

public class Basketball extends Ball{
    //Properties
    public boolean isNBA;
    public int capacity;

    //Behavisors
    public boolean isNBA(){
        if(isNBA){
            return true;
        }else {
            return false;
        }
    }

    //Override
    public void bounce(){
        System.out.println("Basketball bouncing");
    }
}
