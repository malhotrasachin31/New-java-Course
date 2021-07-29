package javafullcourse;

public class VarArgs {
    
    static int sum(int a,int b){
        return a+b;
    }
    
    static int sum(int ...a){
        int sum=0;
        for(int b:a){
           sum+=b;
        }
        return sum;
    }
    
    public static void main(String args[]){
        /*
        you can give a function two or more arguments 
        
        but you cannot made an override function for every new problem thats why we created VarArgs
        
        sum(int ...a)
        
        */
        System.out.println("the sum of above number is "+sum(4,5));
    
        System.out.println("the sum of the variables is "+sum(1,2,2,2,2,2,2,8));
        
    
    }
}
