package javafullcourse;

public class ForEachLoop {
    public static void main(String args[]){
      
        System.out.println("printing using normal for loop");
        
        for(int i=0;i<5;i++){
            System.out.println(i);
        }    
        
        System.out.println("Priniting using for-each loop");
        String array[]={"sachin","Naman"};
        
        for(String element:array){
            System.out.println(element);
        }
    }
}
