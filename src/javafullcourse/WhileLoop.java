package javafullcourse;

public class WhileLoop {

    public static void main(String args[]) {

        /* 
        Primarily there are three types of loops in java 
        1 while loop
        2 for loop
        3 do while loop
        */
        
        
        // while loops
        /*
         1 give condition
         2 Statements as per your code
         3 increment or dicrement as per your requirements
         */
        
        /* 
        how while loops work 
        
        first you will give a condition that you will as per your requirements
        second write code inside the scope of the loop
        increment or decrement as per your requirements
        
         int num = 0;
        while (num <= 10) {
            System.out.println(num);
            num = num + 5;
        }
        
        num=0;
        check for num<=10 (true for first time)
        print the value 0
        now add 5 to num ie num+5=0+5=5
        num=5
        
        again num=5;
        check for condition if num<=10 (yes)    
        print number 5
        now num=num+5=5+5=10
        num=10;
        
        now num = 10
        check conditon print 10
        and now it will break as 10=10 but not less than 10
        num=10;
        final value of num=10
        
        */
        
        
        
        int num = 0;
        while (num <= 10) {
            System.out.println(num);
            num = num + 5;
        }
        
        

    }
}
