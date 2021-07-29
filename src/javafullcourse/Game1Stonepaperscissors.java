package javafullcourse;
import java.util.Scanner;
import java.util.Random;

public class Game1Stonepaperscissors {
    public static void main(String args[]){
        
        Scanner ref=new Scanner(System.in);
        
        // for generating random number till 3
        Random rand=new Random();
        int num=rand.nextInt(3);
        
        System.out.println("Press 0 for Rock ");
        System.out.println("Press 1 for Scissor ");
        System.out.println("Press 2 for Paper ");
      
          
      //  int score=0;
        int input=ref.nextInt();
      
        switch(input){
            case 0:{
                if(num==0){
                    System.out.println("Match is been Drawn !!");
                     break;
                }
                else if(num==1){
                System.out.println("Congratulations You won !");
                 break;
            }
                else if(num==2){
                    System.out.println("Sorrt you lost!");
                     break;
                }
            }
            case 1:{
                 if(num==0){
                    System.out.println("Sorrt you lost !!");
                    break;
                }
                else if(num==1){
                System.out.println(" match drawn !"); 
                break;
            }
                else if(num==2){
                    System.out.println("You won!");
                     break;
                }
            }
            case 2:{
                 if(num==0){
                    System.out.println("You won!!");
                     break;
                }
                else if(num==1){
                System.out.println("Sorrt you lost!"); break;
            }
                else if(num==2){
                    System.out.println("Match drawn"); break;
                }
            }
            default:{
                System.out.println("Sorry you have entered wrong value"); break;
            }
           
        }

        }
    
}
