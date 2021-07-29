package javafullcourse;


class sachin2{
    int age;
    String name;
    public sachin2(){
        this.age=23;
        this.name="sachin malhotra";
    }
}

public class contructorsinjava {
    public static void main(String args[]){
       sachin2 s=new sachin2();
       System.out.println(s.age);
       System.out.println(s.name);
    }
}
