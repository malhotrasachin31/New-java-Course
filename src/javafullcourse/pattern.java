package javafullcourse;

public class pattern {
    static void main(int n){
       if(n>0){
           
           for(int i=0;i<n;i++){
               System.out.print("*");
           }
           
           System.out.println();
           main(n-1);
        } 
    }
    public static void main(String args[]){
       main(4);
    }
}
