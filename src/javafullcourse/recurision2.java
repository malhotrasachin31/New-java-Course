package javafullcourse;
public class recurision2 {
    
    
    static int factorial(int n){
     
        
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
    }
    
    static int main(int num){
        int product=1;
        if(num==0 || num==1){
            return 1;
        }
        else{
            
            for(int i=1;i<=num;i++){
                product*=i;
            }
        }
        return product;
    }
    
    public static void main(String args[]){
        
        /* recursion in java */
        
        // calling ourself again and again
        
        
        int n=5;
        System.out.println("the value is "+factorial(n));
        
        
       
        System.out.println("the value is "+main(8));
        
    }
}
