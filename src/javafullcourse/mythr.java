package javafullcourse;

class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        int num=0;
        while(num!=7){
            System.out.println("hello");
            num++;
        }
    }
}

public class mythr {
    public static void main(String args[]){
        Mythread t1=new Mythread("sachin");
        t1.start();
        System.out.println("The id of this thread is "+t1.getId());
        System.out.println("The name of this thread is "+t1.getName());
    }
}
