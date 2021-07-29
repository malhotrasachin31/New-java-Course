package javafullcourse;


class cylinder{
    private int radius;
    private int height;
    
    
    public cylinder(int r,int h){
        this.radius=r;
        this.height=h;
        
        double area=3.14*radius*radius*height;
        System.out.println(area);
        
        
    }
    
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius2){
        radius=radius2;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height2){
        height=height2;
    }
    public void setArea(int height2, int radius2){
        height=height2;
        radius=radius2;
        
    }
    public double getArea(){
        
        double area=2*3.14*radius*(height+radius);
        return area;
    }
    
    
    
}

public class practocesetonaccesmodifiers {
    public static void main(String args[]){
        
        cylinder c=new cylinder(45,45);
        c.setHeight(34);
        c.setRadius(23);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        c.setArea(4, 2);
        System.out.println(c.getArea());
    }
}
