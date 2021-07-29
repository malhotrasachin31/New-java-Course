package javafullcourse;

class Employee{
    int salary;
    String name;
    
    int getSalary(){
       return salary;
    }
    
    String getName(){
         return name;
    }
    
    void setName(String name2){
        name=name2;
    }
}

class Phone{
    
    public void Ringing(){
        System.out.println("Ringing.....");
    }
    public void Vibrating(){
        System.out.println("Vibrating.....");
    }
    public void SendMessage(){
        System.out.println("Message sending....");
    }
}

class Square{
    
    int side;
    
    public void setSide(){
        System.out.println("The side of the square is "+side);
    }
    
    public int getArea(){
        int area= side*side;
        return area;
    }
    
    public int getPerimeter(){
        int per=4*side;
        return per;
    }
}

class TommyVercetti{
    
    void runnning(){
        System.out.println("Running....");
    }
    void hitting(){
        System.out.println("Hitting.....");
    }
    void walking(){
        System.out.println("Walking.....");
    }
    void firing(){
        System.out.println("Firing.....");
    }
    
}

public class OOPsPractiseSet {
    public static void main(String args[]){
        
        // problem 1
        Employee sachin=new Employee();
        
        sachin.setName("Sachin Malhotra");
        System.out.println(sachin.getName());
        
        sachin.salary=34000;
        System.out.println(sachin.getSalary());
     
        
        // problem 2
        Phone realme=new Phone();
        realme.Ringing();
        realme.SendMessage();
        realme.Vibrating();
        
        // problem 3
        Square sq=new Square();
        
        sq.side=4;
        sq.setSide();
        
        sq.getArea();
        System.out.println("The area is "+sq.getArea());
        System.out.println("The perimeter is "+sq.getPerimeter());
        
        sq.getPerimeter();
            
        // problem 4
        TommyVercetti tv=new TommyVercetti();
        tv.runnning();
        tv.walking();
        tv.firing();
        tv.hitting();
        
        
    }
}
