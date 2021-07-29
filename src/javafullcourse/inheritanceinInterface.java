package javafullcourse;


interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
}

class mySample implements childsample{
    @Override
    public void meth3(){
        System.out.println("Method 3");
    }
    @Override
    public void meth4(){
        System.out.println("Method 4");
    }
    @Override
    public void meth1(){
        System.out.println("Method 1");
    }
    @Override
    public void meth2(){
        System.out.println("Method 2");
    }
}
public class inheritanceinInterface {
    public static void main(String args[]){
        mySample s=new mySample();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
