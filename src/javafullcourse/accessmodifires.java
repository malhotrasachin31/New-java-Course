package javafullcourse;

class a{
    public int x=1;
    protected int y=2;
    int z=3;
    private int a=4;
    
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class accessmodifires {
    public static void main(String args[]){
        a a1=new a();
        //a1.meth();
        System.out.println(a1.x);
        System.out.println(a1.y);
        System.out.println(a1.z);
        //System.out.println(a1.a);
        
        
        
        /*
                   class   package  subclass  world  
        public      Y       Y       Y          Y
        protected   Y       Y       Y          N
        default     Y       Y       N          N
        private     Y       N       N          N
        
        */
    }
}
