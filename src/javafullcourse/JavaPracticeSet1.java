package javafullcourse;

import java.util.Scanner;

public class JavaPracticeSet1 {
    public static void main(String args[]){
        
        
        /*  
         
        task1 := write a program which appends your name from input after good morning
        task2 := write a program to convert km/hr to m/sec
        task3 := detect wheather a number is an integer or not
        task4 := calculate SI 
        task5 := calculate km to miles
        
        */
        // task 1
        Scanner ref=new Scanner(System.in);
        
        String name=ref.nextLine();
        System.out.println("Good Morning "+name);
                
        // task2
        
        float kph=ref.nextFloat();
        float mps=kph*5/18;
        System.out.println(kph+ " KM to Mps is  "+mps);
        
        
        // task3

        boolean yesorno=ref.hasNextInt();
        System.out.println(yesorno);
        
        // task4
        
        float principle=ref.nextFloat();
        float rate=ref.nextFloat();
        float time=ref.nextFloat();
        
        float SI=(principle*rate*time)/100;
        System.out.println("The simple interest is :"+SI);
        
        // task5
        
        float kilom=ref.nextFloat();
        float miles=kilom*10/16;
        System.out.println(miles);
    }
}
