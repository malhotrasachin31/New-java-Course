package javafullcourse;
import java.util.Scanner;
class phone{
    Scanner ref=new Scanner(System.in);
    
    int number;
    
    public int getPhoneNumber(){
        return number;
    }
    
    public void setPhoneNumber(int n){
        number=n;
        if(number==92688){
            System.out.println("Accepted...");
        }
        else{
            System.out.println("Not Accepted..");
        }
    }
    
}

public class accessmodifiers {
    public static void main(String args[]){
    
        phone p1=new phone();
        p1.setPhoneNumber(92688);
        System.out.println(p1.getPhoneNumber());
    }
}
