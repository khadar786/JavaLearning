package khadar.javalearning;

public class Main {

    public static void main(String[] args) {
       //Ball ball = new Ball("blue","justBall",12,45);
       //ball.showColor();
        Ball ball = new Ball();
        ball.setName("Cricket");
        ball.setColor("Red");
        ball.setCapacity(11);
        ball.setBounceRate(140);

        System.out.println("Name :"+ball.getColor()+
                " Color :"+ball.getColor()+
                " Capacity :"+ball.getCapacity()+
                " BounceRate :"+ball.getBounceRate());
    }
}
