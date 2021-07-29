package javafullcourse;
interface camera{
    public void Camera();
}
interface recorder{
    public void Recorder();
}
interface record4K{
    public void Recorder4K();
}
interface call{
    public void Call();
}
interface messages{
    public void Message();
}
interface Gps{
    public void gps();
} 

class smartphone implements camera,recorder,record4K,call,Messages,Gps{    
    public void Camera(){
        System.out.println("Opening Camera...");
    }
    public void gps(){
        System.out.println("Opening GPS....");
    }
    public void Call(){
        System.out.println("Calling....");
    }
     public void Recorder4K(){
        System.out.println("Recording in 4k...."); 
     }
     public void Recorder(){
        System.out.println("Voice Recording...."); 
     }
      public void Message(){
        System.out.println("Messaging...");  
      }
}
public class polymorphism {
    public static void main(String args[]){
        camera cam=new smartphone();
        cam.Camera();
        
    }
}
