package javafullcourse;
import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[]){
        
        int score=0;
        int number=0;
        Scanner ref=new Scanner(System.in);
        
        Random rand=new Random();
        int random=rand.nextInt(100);
        
        
        
        while(number!=random){
            System.out.println("Enter your guess number ");
        number=ref.nextInt();
        if(number==random){
            System.out.println("Congartulations ! You are very smart ");
        }
        if(number>random){
            System.out.println("Sorry Number is Highter than you input ");
        }
        if(number<random){
            System.out.println("Sorry number is smaller than you input ");
        }
        score++;
        
       }
        System.out.println("Your Rank is "+score);
        System.out.println("Rank should be smaller");
    }
}
