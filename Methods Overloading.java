package com.company;

public class methodOverloading {
    //This is method overloading
    // we cannot do method overloading by changing the method return type
    // we have to change the parameters.
    static void foo(){
        System.out.println("Good morning bro!!");
    }

    static void foo(int a){
        System.out.println("Good morning "+a+" bro..");
    }
    static void foo(int a, int b){
        System.out.println("Good morning "+a+" bro..");
        System.out.println("Good morning "+b+" bro..");
    }
    static void change(int x){
        x = 98;
    }
    static void change2(int []arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        //This will not change anything as the copy of x is being passed to the method above.
        int x = 100;
        change(x);
        System.out.println("The value of x after change is "+x);

        //This will change the value that is passed as
        //In this case marks is the reference and reference is passed to the method
        //so it will change the value in primitive datatype.
        //Here we have passed the reference, we havent passed the copy of the object
        //So the value will be changed.
//        int [] marks = {56, 67, 78, 89, 90};
//        change2(marks);
//        System.out.println("The value of the 1st element after " +
//                "change is applied is "+marks[0]);

        // Method Overloading

        foo();
        foo(3000);
        foo(3000, 6000);


    }

}
