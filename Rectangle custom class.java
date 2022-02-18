package com.company;

class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

public class SquareCustomClass {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.side = 5;
        System.out.println("The area of the square is "+s1.area());
        System.out.println("The perimeter of the square is "+s1.perimeter());
    }
}
