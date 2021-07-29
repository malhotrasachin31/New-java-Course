package javafullcourse;
import java.util.Random;
public class MultiArray {
    public static void main(String args[]){
        
        /*
        Array of array is called 2-d Array
         _ _ _  _
        |_|_|_|_|
        |_|_|_|_|
        |_|_|_|_|
        |_|_|_|_|
        
         0 1 2 3 
         1
         2  
         3
        
        
        array[0][1]=1
        
        */
        
        Random rand=new Random();
        
        
        for(int i=0;i<4;i++){
            System.out.print("\n");
            for(int j=0;j<4;j++){
                int random=rand.nextInt(100);
                System.out.print(i);
            }
        }
        
    }
}
