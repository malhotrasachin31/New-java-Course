package javafullcourse;

// scanner class

import java.util.Scanner;
public class UserInputInJava {
    public static void main(String args[]){
        /* 
        
        For taking input from the user the java has a class called Scanner class
            steps 
        1 import Scanner class by import java.util.Scanner;
        2 Make Scanner class and its object
            Scanner scanner=new Scanner(System.in);
        3 Call the variable from the object of scanner object with nextInt() function.
        
        */
        
        Scanner ref=new Scanner(System.in);
        
        System.out.println("System input from user");
        System.out.println("Enter the number");
        int a=ref.nextInt();
        System.out.println("Enter the second number");
        int b=ref.nextInt();
        int sum=a+b;
        System.out.println("the sum is "+sum);
    }
}
