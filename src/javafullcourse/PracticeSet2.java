package javafullcourse;

public class PracticeSet2 {
    public static void main(String args[]){
        
        
        // task 1 = what is the output of the expression
        
        float a=7/4*9/2;
        System.out.println(a);
        
        // task 2 = write a code to encrypt 8 grade and then decrypt 8 grade back
        
        char grade='A';
        int grade2=grade+8;
        
        char grad=(char)grade2;
        // new grade after encryption
        
        System.out.println("The Grade after encryption is "+grad);
        
        // old grade after decryption
     
        grad=(char)(grad-8);
        
        System.out.println("The Grade after encryption is "+grad);
        
    
        
        
        
    }
}
