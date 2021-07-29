package javafullcourse;

public class Dowhileloop {
    public static void main(String args[]){
        /* Do while Loop in java */
        /* 
        do while loop makes always exceute for first time and check the condition
        form another iteration
        
        steps for do while loop execution
        
        1 code exceute no matter condition is true or not
        2 check condition for while loop
        3 excecute regarding to while loop
        
        */
        
        int a=0; // declare the variable
        do{         // entered into loop without check
            System.out.println(a);            // exceute the code
            a++;                                         // increment the num   
        }while(a<=10);                            // checks the logic again and if false
                                                                // it moves out of the loop
    }
        
    }

