package javafullcourse;
public class BreakAndContinue {
    public static void main(String args[]){
        /*
            Break statement in java
        
            break statement cannot excecute the statements after this statement
        
        
        
        */
        
        
        
        for(int i=0;i<10;i++){
            if(i==5){
               break;
            }
            System.out.println(i);
        }
        
        
        /*
        Continue statement makes run the whole code but not that instance whwre continue is placed
        
        */
         for(int i=0;i<10;i++){
            if(i==5){
               continue;
            }
            System.out.println(i);
        }
        
        
        }
}
