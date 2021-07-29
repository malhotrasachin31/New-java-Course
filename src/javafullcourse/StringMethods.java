package javafullcourse;

public class StringMethods {
    public static void main (String args[]){
        
        String name=new String("Sachin Malhotra");
        System.out.println(name);
        
        // for calculating of length of the string
        int length=name.length();
        System.out.println("The length of the string is "+length);
        
        // for replace characters in a string
        String name2=name.replace("a", "*");
        System.out.println(name2);
        
        // to lowe case
        System.out.println(name.toLowerCase());
        
        // to upper case
        System.out.println(name.toUpperCase());
        
        // to extract one index value
        System.out.println(name.charAt(3));
        
        // to extract subSequence
        System.out.println(name.subSequence(4, 8));
        
        // to extract subString
        System.out.println(name.substring(4,10));
     
        // to ends with
        System.out.println(name.endsWith("tra"));
       
         // to starts with
        System.out.println(name.startsWith("Sac"));
        
        // at index at n
        System.out.println(name.indexOf(7));
        
        // equal string check
        System.out.println(name.equals(2));
                
          // equal ignore case
        String name3="sachin malhotra";
        System.out.println(name.equalsIgnoreCase(name3));
        
        
    }
}
