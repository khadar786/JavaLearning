package khadar.javalearning;

public class Main {

    public static void main(String[] args) {
	    float myFloatMinValue=Float.MIN_VALUE;
	    float myFloatMaxValue=Float.MAX_VALUE;
	    System.out.println("Float minimum value "+myFloatMinValue);
        System.out.println("Float maximum value "+myFloatMaxValue);

        double myDoubleMinValue=Float.MIN_VALUE;
        double myDoubleMaxValue=Float.MAX_VALUE;
        System.out.println("Double minimum value "+myDoubleMinValue);
        System.out.println("Double maximum value "+myDoubleMaxValue);

        int myIntValue=5;
        float myFloatValue=5f/2f;
        double myDoubleValue=5/2d;

        System.out.println("float value "+myFloatValue);
        System.out.println("double value "+myDoubleValue);

        double numberOfPounds=200d;
        double convertedkilograms=numberOfPounds*0.45359237d;
        System.out.println("Converted Kilograms= "+convertedkilograms);
    }
}
