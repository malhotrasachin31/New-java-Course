package javafullcourse;

class thread1 extends Thread{
    @Override
    public void run(){
        while(true){
       System.out.println("This is multithreading in java"); 
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("this is thread 2");
        }
    }
}

public class multithreadingIntro {
    public static void main(String args[]){
         
        thread1 t1=new thread1();
        t1.start();
        
        thread2 t2=new thread2();
        t1.start();
        
        // cuncurrant VS parallelism
        
        /*
        
        cooking+chatting+coding @ the same time
        by one person managing single task each
        
        cooking + chatting by two persons each is 
        called pararlellism.
        
        */
        
         
        
    }
}
