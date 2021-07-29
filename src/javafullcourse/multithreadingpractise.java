package javafullcourse;

// multithreading practice

class welcome extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
}

class welcome2 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}

public class multithreadingpractise {
    public static void main(String args[]){
        // first question on threads
        welcome w1=new welcome();
        welcome2 w2=new welcome2();
        
        w1.start();
        
        w2.start();
        
    }
}
