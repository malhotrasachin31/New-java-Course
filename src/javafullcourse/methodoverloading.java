package javafullcourse;

public class methodoverloading {
    
    static void main(){
        System.out.println("hello world");
    }
    static void main(String name){
        String name2=name;
        System.out.println(name2);
    }
    static void main(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]){
        /*
        same name but diffrent parameters
        
        void main(){
        System.out.println("Hello world");
        }
        
        void main(String name){
        String name2=name;
        System.out.println(name2);
        }
        
        
        */
        
        main();
        main("Sachin Malhotra");
        
        
        int arr[]={2,3,4,5,7};
        main(arr);
        
    }
}
