package javafullcourse;

/*
we can use this criteria but code usabiity is not happening 
and focus on the concept that dont invnet the wheel again

code usability is not done here properly

In inheritance we usually can make objects of base class
and then derrived it in derrived class 

check the concept of pure inheritance in second "inheritance2.java"

*/
class GrandFather{
    private String name;
    private int Age;
    
    public int getGrandfatherAge(){
        return Age;
    }
    public void setGrandFatherAge(int a){
        Age=a;
    }
    public String getGrandfatherName(){
        return name;
    }
    public void setGrandFatherName(String Name){
        name=Name;
    }
}

class Father{
    private String name;
    private int Age;
    
    public int getfatherAge(){
        return Age;
    }
    public void setFatherAge(int a){
        Age=a;
    }
    public String getfatherName(){
        return name;
    }
    public void setFatherName(String Name){
        name=Name;
    }
}
 
class Son{
    private String name;
    private int Age;
    
    public int getSonAge(){
        return Age;
    }
    public void setSonAge(int a){
        Age=a;
    }
    public String getSonName(){
        return name;
    }
    public void setSonName(String Name){
        name=Name;
    }
}
public class inheritance {
    public static void main(String args[]){
        /*
        one of the most important pillar of the java OOPs
        
        grandfather
            |
          Father
            |
           son
        
        */
        // grandfather information
        GrandFather gf=new GrandFather();
        gf.setGrandFatherAge(67);
        gf.setGrandFatherName("Jagdish Malhotra");
        System.out.println(gf.getGrandfatherName());
        System.out.println(gf.getGrandfatherAge());
        // father information
        Father f=new Father();
        f.setFatherAge(45);
        f.setFatherName("Pardeep Malhotra");
        System.out.println(f.getfatherName());
        System.out.println(f.getfatherAge());
        // son information
        Son s=new Son();
        s.setSonAge(22);
        s.setSonName("Sachin Malhotra");
        System.out.println(s.getSonName());
        System.out.println(s.getSonAge());
        
    }
}
