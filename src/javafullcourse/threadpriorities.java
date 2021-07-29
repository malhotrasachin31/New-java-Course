package javafullcourse;

class Priority extends Thread{
    public void run(){
        int i=0;
        while(i<=49)
        System.out.println("Hello i am thread first");
        i++;
    }
}

class Priority2 extends Thread{
    public void run(){
        int i=0;
        while(i<=49){
            System.out.println("Hello i am thread 2nd");
            i++;
        }
    }
}
public class threadpriorities {
    public static void main(String args[]){
        Priority p1=new Priority();
        Priority2 p2=new Priority2();
        p2.setPriority(Priority.MAX_PRIORITY); // p2 is exceuted more times than p1
       // p1.start();
        p2.setDaemon(true);
        //p2.start();
        
    }
}
