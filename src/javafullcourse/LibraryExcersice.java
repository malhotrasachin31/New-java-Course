package javafullcourse;
import java.util.Scanner;


class Library{
    
    private String books[];
    private int number;
    
    public Library(){
        this.books=new String[100];
        this.number=0;
    }
    
    public void addBook(String bookname){
        this.books[number]=bookname;
        this.number++;
        System.out.println(bookname+" is been added sucessfully! ");
    }
    public void showBooks(){
        System.out.println("All books are");
        for(int i=0;i<books.length;i++){
            
            if(books[i]==null){
                break;
            }
            System.out.println(" * => "+books[i]);
        }
    }
    
    public void issuebooks(String book){
        System.out.println("All books are");
        for(int i=0;i<books.length;i++){
            if(this.books[i].equals(book)){
                this.books[i]=null;
                continue;
            }
            System.out.println(" * => "+books[i]);
        } 
    }
    
}
public class LibraryExcersice {
    public static void main(String args[]){
        
        // you have to implement a library
        
        /*
        methods:
        add books
        issue book
        return book
        show Available books
        
        properties:
        array to store books ,available etc
        array to store the issued books
        
        */
        
        Library lib=new Library();
        lib.addBook("C++");
        lib.addBook("C");
        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("Javascript");
        
        lib.showBooks();
        
        lib.issuebooks("C++");
        
    }
}