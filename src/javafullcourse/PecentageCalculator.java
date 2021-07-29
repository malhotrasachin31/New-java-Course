package javafullcourse;
import java.util.Scanner;
public class PecentageCalculator {
    public static void main(String args[]){
        Scanner ref=new Scanner(System.in);
        
        System.out.println("Enter the number of subjects ");
        int total=ref.nextInt();
        
        System.out.println("Enter the marks of English");
        int english=ref.nextInt();
        
        System.out.println("Enter the marks of hindi");
        int hindi=ref.nextInt();
        
        System.out.println("Enter the marks of maths");
        int maths=ref.nextInt();
        
        System.out.println("Enter the marks of science");
        int science=ref.nextInt();
        
        System.out.println("Enter the marks of sst");
        int sst=ref.nextInt();
        
        int totalmarks=english+hindi+maths+science+sst;
        
        int percentage=totalmarks/total;
        System.out.println("Total percentage is "+percentage);
    }
}
