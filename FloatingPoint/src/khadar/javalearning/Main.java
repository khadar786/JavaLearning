package khadar.javalearning;

public class Main {

    public static void main(String[] args) {
	    float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;

        System.out.println("Float Min Value "+myFloatMinValue);
        System.out.println("Float Max Value "+myFloatMaxValue);
        System.out.println("Double Min Value "+myDoubleMinValue);
        System.out.println("Double Max Value "+myDoubleMaxValue);

        int intValue =5;
        float floatValue=5.25f;
        double doubleValue=5.25d;

        int myIntValue =5/2;
        float myFloatValue =5f/3f;
        double myDoubleValue=5d/3d;
        System.out.println("My Int Value :"+myIntValue);
        System.out.println("My Float Value :"+myFloatValue);
        System.out.println("My Double Value :"+myDoubleValue);

        double onePound =0.45359237d;
        double noOfPounds =200d;
        double inKilograms;
        inKilograms=(noOfPounds*onePound);

        System.out.println("Converted kilograms :"+inKilograms);

        double pi=3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

    }
}
