package javafullcourse;

// interface in Java

/*
Interface is a point where two systems meet and interact
you have to make all methods abstract 
group of mthods having empty bodies
*/

interface Bicycle{
    void applyBrakes(int dec);
    void applyRace(int inc);
}

class AvonCycle implements Bicycle{
    public void applyBrakes(int dec){
        System.out.println("Applying Brakes");
    }
    public void applyRace(int inc){
        System.out.println("Applying Race");
    }
}
public class interfacesinJava {
    public static void main(String args[]){
        AvonCycle ac=new AvonCycle();
        ac.applyBrakes(3);
        ac.applyRace(5);
                
                // you can create properties in interface
                // you can not modify the properties in interface
    }
}
