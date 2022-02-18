package com.company;
class RectangleII{
    public int l;
    public int b;
    public int getL() {return l;}
    public void setL(int l) {this.l = l;}
    public int getB() {return b;}
    public void setB(int b) {this.b = b;}
}
class Cuboid extends RectangleII{
    public int h;
    public int getH() {return h;}
    public void setH(int h) {this.h = h;}
    public int volume(){return l * b * h;}
}

public class InheritanceShapeII {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        c1.setL(6);
        c1.setB(4);
        c1.setH(2);
        System.out.println("Volume is: "+c1.volume());

    }
}
