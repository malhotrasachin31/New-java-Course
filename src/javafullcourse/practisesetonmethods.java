package javafullcourse;

public class practisesetonmethods {
    
    static void multiplicationtabel(int n){
        
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+i*n);
        }
        
    }
    
    static void pattern_1(int n){
        
        for(int i=0;i<=n;i++){
            System.out.println();
            for(int j=i;j<=n;j++){
                System.out.print(" * ");
            }
        }
        
    }
    
    static void pattern_1_rec(int number){
       if(number>0){
           for(int i=1;i<=number;i++){
               System.out.print(" * ");
           }
           System.out.println();
           pattern_1_rec(number-1);
           /*
           
           * * * * *
           * * * *
           * * *
           * *
           *
           
           */
           
           
       }
    }
    
    static int sum_n(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum_n(n-1);
        }
    }
    
    static void pattern_2(int num){
        
        for(int i=0;i<num;i++){
            System.out.println();
            for(int j=1;j<=1+i;j++){
                System.out.print(" * ");
            }
        }
        
    }
    
    static int fibbo(int first){
        if(first==1){
            return 0;
        }
        if(first==2){
            return 1;
        }
        else{
            return fibbo(first-1)+fibbo(first-2);
        }
    }
    public static void main(String args[]){
        
        // method 1
        multiplicationtabel(5);
        
        // method 2
        pattern_1(5);
        
        // method 3
        int sum=sum_n(6);
        System.out.println("\n the sum is "+sum);
        
        // method 4
        pattern_2(4);
        
        // method 5
        int result=fibbo(5);
        System.out.println(result);
        
        //method 6
        pattern_1_rec(5);
    }
}
