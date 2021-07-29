package javafullcourse;

class A1{
    private int b;
    
    public A1(int a){
        this.b=a;
    }
    
    public int getNumber(){
        return b;
    }
    public void setNumber(int b2){
        b=b2;
    }
}

public class This {
    public static void main(String args[]){
        A1 a=new A1(9);
        System.out.println(a.getNumber());
    }
}
