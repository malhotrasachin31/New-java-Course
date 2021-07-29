package javafullcourse;

class sachin{
    static void main(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    static void main2(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
}

public class Methdods {
    
     void hello(){
            System.out.println("Hello world");
        }
    
    public static void main(String args[]){
        
       Methdods meth=new Methdods();
       meth.hello();
         
        sachin n=new sachin();
        n.main(2, 2);
        n.main2(4, 2);
    }
}
