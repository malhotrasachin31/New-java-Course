package javafullcourse;

class MultiThreading extends Thread{
    public void main(){
        System.out.println("Using MultiThreading...1...");
    }
}
class MultiThreading2 extends Thread{
    public void main2(){
        System.out.println("Using MultiThreading...2...");
    }
}
public class JavaMultithreadingbyEThreads {
    public static void main(String args[]){
        // multithreading by extending threads
        
        MultiThreading t1=new MultiThreading();
        MultiThreading2 t2=new MultiThreading2();
        
        t1.start();
        t2.start();
        
    }
}
