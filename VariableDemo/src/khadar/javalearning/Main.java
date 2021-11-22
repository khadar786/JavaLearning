package khadar.javalearning;

public class Main {
    int a;
    static int b=20;
    public void print(){
        int c=10;
        System.out.println("Method local variable :"+c);
    }
    public static void main(String[] args) {
	    Main obj=new Main();
        System.out.println("Instance variable :"+obj.a);
        System.out.println("Static variable :"+Main.b);
        obj.print();
    }
}
