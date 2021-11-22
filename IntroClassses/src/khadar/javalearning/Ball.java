package khadar.javalearning;

public class Ball {
    private String color;
    private String name;
    private int capacity;
    private int BounceRate;

    public Ball(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return BounceRate;
    }

    public void setBounceRate(int bounceRate) {
        BounceRate = bounceRate;
    }

    /*public Ball(String color,String name,int capacity,int BounceRate){
        this.color=color;
        this.name=name;
        this.capacity=capacity;
        this.BounceRate=BounceRate;
    }
    public void showColor(){
        System.out.println(this.color);
    }

    public void showName(){
        System.out.println(this.name);
    }

    public void inflate(){
        System.out.println("Inflating");
    }*/
}
