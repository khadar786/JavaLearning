class A{
    private int a;

    A(int a){
        this.a=a;
    }

    private void methodA(){
        System.out.println("Method A :"+a);
    }
}

class B {
    public static void main(String args[]){
        A objA=new A(10);
        //objA.methodA();
    }
}
