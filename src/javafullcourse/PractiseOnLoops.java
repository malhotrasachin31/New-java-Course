package javafullcourse;

public class PractiseOnLoops {
    public static void main(String args[]){
        
        //task 1: write a program for printing the pattern
        /*
        
        * * * * * 
        * * * *
        * * *
        * *
        *
        
        */
        
        for(int i=5;i>=0;i--){
            System.out.println("\n");
            for(int j=i-1;j>=0;j--){
                System.out.print(" * ");
            }
        }
        
        // task 2: sum of first n even number
        
        int sum=0;
        for(int i=0;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);
        
        
        // task3: multiplication table
        
        int num=2;
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
        
        
        // task4 : multiplication table in reverse order
         int num2=10;
        for(int i=10;i>=1;i--){
            System.out.println(num2+"x"+i+"="+(num2*i));
        }
        
        //factorial of a number
        
        int number=5;
        int fact=1;
        for(int i=1;i<=5;i++){
          fact=i*fact;
        }
        System.out.println(fact);
    }
}
