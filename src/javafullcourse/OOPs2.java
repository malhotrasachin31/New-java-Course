
package javafullcourse;

class employee{
    String name;
    int salary;
    int age;
    
    void getDetails(){
        System.out.println("The Name of the Employee is "+name);
        System.out.println("The salary earned is "+salary);
        System.out.println("The age he/she has "+age);
    }
}

public class OOPs2 {
    public static void main(String args[]){
        
        employee sachin=new employee();
        employee naman=new employee();
        employee sandeep=new employee();
        
        sachin.name="sachin malhotra";
        sachin.age=22;
        sachin.salary=34000;
        
        naman.name="Naman Malhotra";
        naman.age=21;
        naman.salary=33000;
        
        sandeep.name="Sandeep Malhotra";
        sandeep.age=45;
        sandeep.salary=67000;
        
        System.out.println("All details of employee-1");
        sachin.getDetails();
        
        System.out.println("All details of employee-2");
        naman.getDetails();
        
        System.out.println("All details of employee-3");
        sandeep.getDetails();
        
    }
}
