package javafullcourse;

abstract class pen{
    abstract void write();
    abstract void refill();
} 

class fountainpen extends pen{
    public void write(){
        System.out.println("Started Writing...");
    }
    public void refill(){
        System.out.println("Started Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing Nib....");
    }
}

interface Animals{
    public void eat();
    public void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
class human extends Monkey implements Animals{
    public void eat(){
        System.out.println("Eating....");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

public class practisesetInterface {
    public static void main(String args[]){
        
        // first and second practise question
        fountainpen pen=new fountainpen();
        pen.write();
        pen.refill();
        pen.changeNib();
        
        
        // third question
        human sachin=new human();
        sachin.bite();
        sachin.eat();
        sachin.sleep();
        sachin.jump();
        
        
    }
}
