package demo.java;

public class InnerClass {
    int t = 10;
    void disp(){
        System.out.println("t is "+t);
    }
    private class InnerClassII{
        int z= 100;
        void show(){
            System.out.println("z is "+z+" and t is "+t);
        }
    }

    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        InnerClass.InnerClassII inner = outer.new InnerClassII();
        outer.disp();
        inner.show();
    }
}
