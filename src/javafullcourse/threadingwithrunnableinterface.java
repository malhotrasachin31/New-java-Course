package javafullcourse;

class MythreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread 1");
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2");
    }
}
public class threadingwithrunnableinterface {
    public static void main(String args[]){
        MythreadRunnable1 bullet1=new MythreadRunnable1();
        MythreadRunnable2 bullet2=new MythreadRunnable2();
        
        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        
        gun1.start();
        gun2.start();
        
        /*
        Thread life cycle in java
        
        1 NEW
        2 RUNNABLE
        3 RUNNING STATE
        4 TERMINATED STATE
        
        */
        
    }
}
