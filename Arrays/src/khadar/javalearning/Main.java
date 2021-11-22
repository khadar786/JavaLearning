package khadar.javalearning;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    /*int [] score={1,2,3,4};
        String [] students={"Nagoor","nawaz","khadar","mymoon"};
        int[] newArray=new int[5];
        newArray[0]=1;
        newArray[1]=2;
        newArray[2]=3;
        newArray[3]=4;
        newArray[4]=5;

        for (int i=0;i<students.length;i++){
            System.out.println("Name :"+students[i]);
        }*/
        
        ArrayList animals = new ArrayList();
        animals.add("Pig");
        animals.add("cow");
        animals.add("parrot");
        animals.add("chettah");

        /*animals.remove(0);
        animals.add(0,"Dog");
        animals.remove("parrot");*/
        if(animals.contains("cow")){
            animals.remove("cow");
        }else{
            System.out.println("Nope");
        }
        System.out.println(animals.size());

        for(int i=0;i<animals.size();i++){
            System.out.println("Anaima : "+animals.get(i));
        }

        /*for (Object animal:animals
             ) {
            System.out.println(animal);
        }*/
    }
}
