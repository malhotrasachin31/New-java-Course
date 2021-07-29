package javafullcourse;
import java.util.Scanner;
import java.util.Random;
class Game{
   Scanner ref=new Scanner(System.in);
   
   private int uservalue;
   private int random;
   private boolean iscorrect=false;
   private int score;
    // for generating random number
    public Game(){
        Random rd=new Random();
        random=rd.nextInt(100);
    }
    
    public void UserInput(){
        uservalue=ref.nextInt();
    }
    public void isCorrectNumber(){
        score++;
        if(random==uservalue){
            iscorrect=true;
            System.out.println("Congratulations...you won");
        }
        else if(random>uservalue){
            iscorrect=false;
            System.out.println("You have entered small value");
        }
        else if(random<uservalue){
            iscorrect=false;
            System.out.println("You have entered large value");
        }
    }
    
   
    public int getScore(){
        return score;
    }
    
}
    


public class guessnumberOOps {
    public static void main(String args[]){
        
        boolean iscorrect=false;
        int score=0;
        // for random number
        Game g1=new Game();
        while(iscorrect!=true){
        g1.UserInput();
        g1.isCorrectNumber();
       }
       
        System.out.println(g1.getScore());
        
    }
}
