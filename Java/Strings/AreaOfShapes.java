package Java.Strings;
import java.util.*;
class Shape{
    public void area() {
        System.out.println("Invalid area");
    }
}
class Rectangle extends Shape{
    float length,breadth;
    public  Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void area() {
        float result = length*breadth;
        System.out.println("area of rectangle"+ result);
    }
}
class Triangle extends Shape{
    float base,height;
    public Triangle(float base,float height){
        this.base=base;
        this.height=height;
    }
    public void area(){
        float result = (base*height)/2;
        System.out.println("area of triangle:"+ result);
    }
}
class Circle extends Shape{
    float radius;
    public Circle(float radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        double result = Math.PI*radius*radius;
        System.out.println("area of circle:"+result);
    }
}
public class AreaOfShapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,5);
        Triangle t = new Triangle(8,6);
        Circle c = new Circle(7);
        r.area();
        t.area();
        c.area();
    }
}
