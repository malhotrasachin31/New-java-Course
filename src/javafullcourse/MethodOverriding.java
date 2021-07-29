package javafullcourse;


class Mo{
    
    public void methodA(){
        System.out.println("I am method A of Class A");
    }
    public void methodB(){
        System.out.println("I am Method B of Class A");
    }
    
}

class No extends Mo{
    
    @Override
    public void methodA(){
     System.out.println("I am method B of class B");   
    }
    public void methodC(){
        System.out.println("I am method C of class B");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        No n=new No();
        n.methodA();
        n.methodB();
       
    }
}
