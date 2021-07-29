package javafullcourse;
import java.util.Scanner;
public class bookslib {
    
    static void addBooks(){
        Scanner ref2=new Scanner(System.in);
        Scanner ref3=new Scanner(System.in);
        int numbers;
        
        String books[]=new String[100];
        
       System.out.println("How many books you want to Add"); 
       numbers=ref2.nextInt();
       for(int i=0;i<numbers;i++){
        System.out.println("Enter the book Name");
        books[i]=ref3.nextLine();
    }
        
    }
    static void ReturnBook(){
        
    }
    static void showAllBooks(){
        
    }
    static void showIssueBooks(){
        
    }
    
    public static void main(String args[]){
        
        System.out.println("Enter the number as per your req");
        System.out.println("Press 1 for add Book");
        System.out.println("Press 2 for return book");
        System.out.println("Press 3 for search book");
        System.out.println("Press 4 for show all books");
        System.out.println("press 5 for show issued books");
        
        Scanner ref=new Scanner(System.in);
        int num=ref.nextInt();
        
        switch(num){
            case 1:{
                addBooks();
                System.out.println("Books added sucessfully");
                break;
            }
            case 2:{
                
            }
            case 3:{
                
            }
            case 4:{
                
            }
            default:{
                
            }
        }
        
    }
}
