package com.company;
class Circle{
    public int r;
    Circle(int radius){
        System.out.println("I am a circle class parametrized constructor.");
        this.r = radius;
    }
    public double area(){
        return Math.PI * this.r * this.r;
    }
}
class CylinderII extends Circle{
    public int h;
    CylinderII(int radius, int height){
        super(radius);
        this.h = height;
    }
    public double volume(){
        return Math.PI*this.r*this.r*this.h;
    }
}
public class InheritanceShape {
    public static void main(String[] args) {
        CylinderII c1 = new CylinderII(4, 6);
        System.out.println("Area of the circle is : "+c1.area());
        System.out.println("Volume is : "+c1.volume());
    }
}
