package com.company;

class Cylinder{
    private int height;
    private int radius;
    Cylinder(){
        height = 4;
        radius = 2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    float surfaceArea(int height, int radius){
        return (2*3.14f*radius*height)+(2*3.14f*radius*radius);
    }
    float volume(int height, int radius){
        return 3.14f*radius*radius*height;
    }
}

public class Cylinder_class {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
//        c1.setHeight(6);
//        c1.setRadius(4);
        int h = c1.getHeight();
        int r = c1.getRadius();
        System.out.println("Surface Area: "+c1.surfaceArea(h, r));
        System.out.println("Volume: "+c1.volume(h, r));
    }
}
