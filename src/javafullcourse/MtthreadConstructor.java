package javafullcourse;
class Mylti extends Thread{
    public void run(){
        System.out.println("Hello world");
    }
}
class Mylti2 extends Thread{
    public void run(){
        System.out.println("Hello world 2");
    }
}
public class MtthreadConstructor {
    public static void main(String args[]){
        Mylti t1=new Mylti();
        Mylti2 t2=new Mylti2();
        
        
        
        try{
             Mylti.sleep(10);
             Mylti2.sleep(100);
            t1.start();
            t2.start();
           
        }catch(Exception e){
            System.out.println("Sorry something went wrong..");
        }
    }
}
