package javafullcourse;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the marks of the first subject");
        int physics=scan.nextInt();
        
        System.out.println("Enter the marks of the second subject");
        int chemistry=scan.nextInt();
        
        System.out.println("Enter the marks of the third subject");
        int maths=scan.nextInt();
        
        if(physics>=40 && chemistry>=40 && maths>=40){
            int total=physics+chemistry+maths;
            float per=total/3;
            System.out.println("Congratulations! you r promoted with "+per+"%");
        }
        else{
            System.out.println("Sorry ! Your are failed please prepare it for next time");
        }
    }
}
