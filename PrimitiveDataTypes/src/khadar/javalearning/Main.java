package khadar.javalearning;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value :"+myMinValue);
        System.out.println("Integer Maximum value :"+myMaxValue);

        System.out.println("Busted Max value (Overflow):"+(myMaxValue+1));
        System.out.println("Busted Min value (Underflow):"+(myMinValue-1));

        int myMaxIntTest =2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value :"+myMinByteValue);
        System.out.println("Byte Maximum value :"+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value :"+myMinShortValue);
        System.out.println("Short Maximum value :"+myMaxShortValue);

        long myLongValue =100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum value :"+myMinLongValue);
        System.out.println("Long Maximum value :"+myMaxLongValue);

        long bigLongLiterlValue =2_147_483_647_234L;
        System.out.println(bigLongLiterlValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);

        //Challege
        byte byteValue =10;
        short shortValue=20;
        int intValue =50;

        long longTotal =50000L+10L*(byteValue+shortValue+intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000+10 *(byteValue+shortValue+intValue));


    }
}
