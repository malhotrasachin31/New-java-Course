package javafullcourse;

class oldNew implements Runnable{
    public void run(){
         System.out.println("Hello world ");
    }
}
public class runnable {
    public static void main(String args[]){
        oldNew od=new oldNew();
        Thread t1=new Thread(od);
        t1.start();
    }
}
