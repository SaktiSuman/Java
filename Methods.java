package com.company;

public class CWH_methods {
    //This method can be called directly as it is static.
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    static void tellJoke(){
        //Return type is void, means it returns nothing.
        System.out.println("Why did the poor man sell yeast? " +
                "To raise some dough.");
    }
    //Method invocation using object creation.
    //This method will be called using object as it is not static.
    int product(int x, int y){
        int z;
        z = x*y;
        return z;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int c = logic(x, y);
        int a = 2;
        int b = 1;
        int c1 = logic(a, b);
        CWH_methods obj = new CWH_methods();
        int c2 = obj.product(x, y);
        int c3 = obj.product(a, b);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c);
        System.out.println(c1);
        tellJoke();
    }
}
