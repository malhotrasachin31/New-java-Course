package javafullcourse;

// class CAR has some functions
class car{
    
    void Engine(){
        System.out.println("V8 engine");
    }
    void Wheels(){
        System.out.println("Michellinn");
    }
    void body(){
        System.out.println("Armored body");
    }
    void brakes(){
        System.out.println("Firellei Brakes");
    }
    void clutch(){
        System.out.println("Hydraulic Clutch");
    }
    void race(){
        System.out.println("rataratatatata");
    }
    void seats(){
        System.out.println("Sparco seats");
    }
}

public class OOPs {
    public static void main(String args[]){
         
        /*
        
        introduction to OOPs :
        D R Y Principal is called OOps
        Do not repeat yourself
        
        Good approach for practical approach
        Real world code applications
        */
        
        /*
        
        Noun=> Object => Employee
        Adjectives=> Attributes => name, age etc.
        Verb=> Methods=>getSalary(),getincrement()
        
        */
        
       /*
        OOPs terminology
        
        Abstraction : Hiding internal details
        Encapsulation : The act of putting various components in a capsule
        Polymorphism : Same name diffrent actions
        Inheritance : The act of derriving new things from existing things
        
        
        */
        
        car Mustang=new car(); // mustang car object
        Mustang.Engine();
        Mustang.Wheels();
        Mustang.body();
        Mustang.clutch();
        Mustang.seats();
        Mustang.race();
        
       
        
    }
}
