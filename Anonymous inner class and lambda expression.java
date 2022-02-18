package demo.java;

public class lambdaClassDemo {
    interface Hello{
        void disp();
    }
    interface Calculation{
        int operations(int x, int y);
    }

    public static void main(String[] args) {
        Hello h1 = new Hello() {
            @Override
            public void disp() {
                System.out.println("Hello....");
            }
        };
        h1.disp();
        Hello n2 = ()->{
            System.out.println("Hello h111...");
        };
        n2.disp();
        Calculation c1 = (x,y)->{
            return x+y;
        };
        Calculation c2 = (x, y)->x-y;
        Calculation c3 = (x, y)->x*y;
        System.out.println(c1.operations(11,23));
        System.out.println(c2.operations(31,2));
        System.out.println(c3.operations(31,2));
    }
}
