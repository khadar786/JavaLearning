import khadar.javalearning.ClassC;
public class ClassD extends ClassC {
    ClassD(int a){
        super(a);
    }
    public static void main(String args[]){
        ClassD dobj=new ClassD(20);
        dobj.methodC();
        System.out.println("The value of a is :"+dobj.a);
    }
}
