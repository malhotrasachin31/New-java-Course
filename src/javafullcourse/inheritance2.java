package javafullcourse;

// pure inheritance concept

/*
lets make a class named animal and then derrived
to Dog 
*/

class Animal{
    private String NameOfAnimal;
    private String Property;
    private int NumberofLegs;
    
    public String getNameOfAnimal(){
        return NameOfAnimal;
    }
    public void setNameOfAnimal(String animal){
        NameOfAnimal=animal;
    }
    
    public String getProperty(){
        return Property;
    }
    public void setProperty(String prop){
        Property=prop;
    }
    
    public int getNumberOfLegs(){
        return NumberofLegs;
    }
    public void setNumberOfLegs(int legs){
        NumberofLegs=legs;
    }
}

class GermanShepherd extends Animal{
    private String NameOfBreed;
    
    public String getBreedName(){
        return NameOfBreed;
    }
    public void setBreed(String breed){
        NameOfBreed=breed;
    }
}

public class inheritance2 {
    public static void main(String args[]){
        
        // dog breed class (derrived) can call base class

        GermanShepherd a=new GermanShepherd();
        a.setNameOfAnimal("Dog");
        a.setBreed("German Shepherd");
        a.setProperty("It Barks");
        a.setNumberOfLegs(4);
        System.out.println("The Base Class of Animal is "+a.getNameOfAnimal());
        System.out.println("The Breed of the Dog is "+a.getBreedName());
        System.out.println("Its Main Prperty is "+a.getProperty());
        System.out.println("Number of legs it have "+a.getNumberOfLegs());
        
    }
}
