package javafullcourse;
import java.util.Scanner;
public class Arrays {
    public static void main(String args[]){
        /*
        Arrays is the lineae combination of the homogenous data
        Array is the object
        You can store the data in an array
        
       Arrays can be used in place of a variable as we have to make every single 
        variable for every data we insert
        
        Syntax pf an array
        
        int array[][]=new int[][];
        (just make the object of the array and initialze the total storage)
        
        int array[][]={2,2,2,2,2,2,2};
        (just declare,memory allocation and initialization in an array together)
        
        int array[][];
        array[][]=new int[][];
        (object reference)
        
        */
        int array[]=new int[5];
        array[0]=2;
        array[1]=4;
        array[2]=5;
        array[3]=6;
        array[4]=9;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
        // array with the help of scanner class
        
        Scanner ref=new Scanner(System.in);
        
        /*
        How array works in a scanner class
        
        steps:
            1 initialize the array and allocate its memory
            
            int array[]=new int[5];
        
            2 Now place the any kind of loop upto array length
        
            for(int i=0;i<array.length;i++){
            
        }
            3 scan each element from user side with scanner object
            
        for(int i=0;i<array.length;i++){
            array[i]=ref.nextInt();
        }
       
            4 now display the array elements
        
         for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
        */
         for(int i=0;i<array.length;i++){
            array[i]=ref.nextInt();
        }
          for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
       
        
        
        
    }
}
