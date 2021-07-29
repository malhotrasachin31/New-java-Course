package javafullcourse;


class employee2{
    
    private int id;
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name=n;
    }
    public int getID(){
        return id;
    }
    public void setID(int n){
        id=n;
    }
}

public class Privateaccessmodifiers {
    public static void main(String args[]){
        
      employee2 sachin=new employee2();
      
      sachin.setName("Sachin Malhotra");
      System.out.println(sachin.getName());
      
      sachin.setID(67);
      System.out.println(sachin.getID());
        
    }
}
