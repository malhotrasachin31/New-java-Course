package javafullcourse;

class EH{
    public void main(){
        int a=2;
        int b=0;
        try{
        int c=a/b;
        }catch(Exception ex){
            System.out.println("Not defined");
        }
        
    }
}

public class exception {
    public static void main(String args[]){
        EH c1=new EH();
        c1.main();
    }
}
