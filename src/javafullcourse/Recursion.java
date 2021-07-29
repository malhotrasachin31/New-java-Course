package javafullcourse;

public class Recursion {
    
    static int main(int n){
      
        //int num=n;
       
        if(n==0 ||n==1){
          return 1;
        }
        else{
           return n*main(n-1);
        }
        
        
    }
    
    public static void main(String args[]){
        /* recursion is the process in which function calls
        it self 
        for eg=factorial of number
        */
        
        System.out.println("the factorial of 4 is "+main(4));
    }
}
