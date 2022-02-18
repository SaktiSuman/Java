package com.company;

class CellPhone{
    public void ring(){
        System.out.println("Cell Phone Ringing..");
    }
    public void vibrating(){
        System.out.println("Cell Phone Vibrating..");
    }
    public void calling(){
        System.out.println("Cell Phone Calling..");
    }
    public void messaging(){
        System.out.println("Cell Phone sending texts..");
    }
}

public class CellPhone_CustomClass {
    public static void main(String[] args) {
        System.out.println("Calling the custom class..");
        CellPhone c1 = new CellPhone();
        c1.calling();
        c1.messaging();
        c1.ring();
        c1.vibrating();
    }
}
