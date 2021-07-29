package javafullcourse;

interface Qualities1{
    public void Call();
    public void Message();
}
interface Qualities2{
    public void camera();
    public void GPS();
    public void Touch();
    default void RecordingIn4K(){
        System.out.println("recording in 4k...");
    }
}

class CellPhone implements Qualities1{
    @Override
    public void Call(){
        System.out.println("Calling.....");
    }
    @Override
    public void Message(){
        System.out.println("Messaging....");
    }
}

class SmartPhone extends CellPhone implements Qualities2{
    @Override
    public void camera(){
        System.out.println("Opening Camera...");
    }
    @Override
    public void GPS(){
        System.out.println("Opening GPS....");
    }
    @Override
    public void Touch(){
        System.out.println("Touch is working...");
    }
    @Override
    public void RecordingIn4K(){
        System.out.println("Recording in 4k as well as 8k...");
    }
}
public class AbstractclassMI {
    public static void main(String args[]){
     SmartPhone s=new SmartPhone();
     s.RecordingIn4K();
     s.Call();
     s.GPS();
     s.Touch();
     s.camera();
     s.Message();
    }
}
