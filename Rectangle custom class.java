package com.company;

class Rectangle{
    int length;
    int breadth;
    public void operations(){
        System.out.println("The area of the rectangle is "+(length * breadth));
        System.out.println("The perimeter of the rectangle is "+(2*(length + breadth)));
    }
}

public class Rectangle_CustomClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 3;
        r1.breadth = 5;
        r1.operations();

    }
}
