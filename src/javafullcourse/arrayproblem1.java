package javafullcourse;
import java.util.Scanner;
public class arrayproblem1 {
    
    static void main(){
    
        String[] array = {"nawada","vikaspuri","janakpuri","tilak Nagar","subhash nagar"};
        int[] rupees = {5,10,15,20,25};
        
        Scanner ref=new Scanner(System.in);
        
        System.out.println("Enter the pick up location");
        String pick=ref.nextLine();
        
        System.out.println("Enter the drop location");
        String drop=ref.nextLine();
        
    
        
       
        int stop=0;
        for(int i=0;i<array.length;i++){
            
            if(drop.equalsIgnoreCase(array[i])){
                stop=i;
            }
        }
        
       
        int ticket=0;
        ticket=rupees[stop-1];
        System.out.println("your cost of the ticket from "+pick+" to "+drop+" is "+ticket);
        
        
    }
    
    
    public static void main(String args[]){
        
        /*
        area array = {"nawada","vikaspuri","janakpuri","tilak Nagar","subhash nagar"};
        cost rupees = {5,10,15,20,25};
        */
        main();
        
    }
}
