package javafullcourse;

class A{
    private String Name;
    public A(){
        System.out.print("I am a Base Class Contructor");
    }
    public A(int v){
        System.out.println("I am Base class constructor having value of "+v);
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }
    
}
 
class B extends A{
    private String Name;
    public B(){
        // calls the base class contructor having same syantx
        super(8);
        System.out.print("I am a Derrived Class Contructor");
    }
    public B(int a){
        System.out.println("I am An Overloaded constructor with a value of "+a);
    }
    
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }
}

public class ConstructorsInInheritance {
    public static void main(String args[]){
       
       B a=new B();
      
        
    }
}
