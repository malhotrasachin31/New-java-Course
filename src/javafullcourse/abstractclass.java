package javafullcourse;

abstract class Parent{// parent class
    private int num;
    Parent(){
        this.num=90;
        System.out.println("you entered a number "+this.num);
    }
    abstract public void AbstractMethod();
    
}

// classes having abstract methods are called abstract classes
/*
Abstract Methods are those which can only be declare the methods and aint initialize them 

you cannot make the object of an abstract class
if you are making an abstract function that means you have to make your class abstract
u can call an absctract class by derrived class by inheritance


*/

class Son2 extends Parent{
    public void AbstractMethod(){
        System.out.println("this number is 90");
    }
}

public class abstractclass {
    public static void main(String args[]){
        Son2 s=new Son2();
        s.AbstractMethod();
        
    }
}
