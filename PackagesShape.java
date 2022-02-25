package com.company.codeWithSakti.shape;

class shape{
    private int l;
    private int b;
    private int h;
    private int r;
    private int rCircle;
    private int side;

    public int getrCircle() {return rCircle;}
    public void setrCircle(int rCircle) {this.rCircle = rCircle;}
    public int getSide() {return side;}
    public void setSide(int side) {this.side = side;}
    public int getL() {return l;}
    public void setL(int l) {this.l = l;}
    public int getB() {return b;}
    public void setB(int b) {this.b = b;}
    public int getH() {return h;}
    public void setH(int h) {this.h = h;}
    public int getR() {return r;}
    public void setR(int r) {this.r = r;}
}
class Rectangle extends shape{
    public void area(int l, int b){
        System.out.println("Area of the rectangle: "+(l*b));
    }
}
class Square extends shape{
    public void area(int side){
        System.out.println("Area of the square: "+(side * side));
    }
}
class Circle extends shape{
    public void area(int r){
        System.out.println("Area of the circle: "+(3.14f*r*r));
    }
}
class Cylinder extends shape{
    public void area(int r, int h){
        System.out.println("The surface area of the cylinder is: "+2*3.14f*r*(r + h));
    }
    public void volume(int r, int h){
        System.out.println("Volume of the cylinder: "+3.14f*r*r*h);
    }
}
class Sphere extends shape{
    public void area(int r){
        System.out.println("Surface Area of the sphere: "+4*3.14f*r*r);
    }
    public void volume(int r){
        System.out.println("Volume of the sphere is: "+1.33f*3.14f*r*r*r);
    }
}
public class problem5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        Cylinder c1 = new Cylinder();
        Sphere sp1 = new Sphere();
        r1.setL(4);
        r1.setB(2);
        r1.area(r1.getL(), r1.getB());
    }
}
