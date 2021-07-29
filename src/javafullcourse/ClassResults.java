package javafullcourse;
import java.util.Scanner;

class School{
    Scanner ref=new Scanner(System.in);
    
   
    private int subjectsmarks;
    private int total=0;
    private int per;
    private int nos=ref.nextInt();
    public int getTotal(){
        for(int i=0;i<nos;i++){
            subjectsmarks=ref.nextInt();
            total+=subjectsmarks;
        }
        return total;
    }
   
    
    public int getPer(){
        per=total/nos;
        return per;
    }
    
    
}

public class ClassResults {
     public static void main(String args[]){
       
         School Springmeadows=new School();
         
        
         System.out.println(Springmeadows.getTotal());
         System.out.println(Springmeadows.getPer());
     }
}
