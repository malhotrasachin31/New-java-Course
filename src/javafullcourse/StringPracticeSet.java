package javafullcourse;

public class StringPracticeSet {
    public static void main(String args[]){
        
        // task 1 : convert a string to lower case
        String name=new String("Jhonny Walker");
        System.out.println(name.toLowerCase());
        
        // task 2 : replace any character with star
        String name2=name;
        System.out.println(name2.replace("a", "*"));
        
        // task 3 : write a letter template which looks like 
        // Letter = "Dear <|Name|> , trans a lot
        
        String name3="Dear <|Name|> , Thanks a Lot";
        System.out.println(name3.replace("<|Name|>", "sachin"));
        
        // task4 : detect double and triple spaces in a string
        String space="this string  contains doubles  and   triple   spaces";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));
    }
}
