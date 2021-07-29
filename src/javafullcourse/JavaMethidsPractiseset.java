package javafullcourse;

public class JavaMethidsPractiseset {
    
    // iterative approach
    static void multiplication_table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
    static void pattern(){
        for(int i=0;i<5;i++){
          for(int j=0;j<i;j++){
              System.out.print("*");
          }
          System.out.println();
        }
    }
    
    static void pattern2(){
        for(int i=4;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static int fib(int num){
        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        else{
            return fib(num)+fib(num-1);
        }
    }
    public static void main(String args[]){
        /*
        Java Methods Practise set
        
        */
        // task 1: Print multiplication table
        
        multiplication_table(5);
        pattern();
        fib(3);
    }
}
