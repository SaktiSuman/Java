abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("Fountain pen writes.");
    }
    public void refill(){
        System.out.println("Fountain pen refilling.");
    }
    public void nib(){
        System.out.println("Fountain pen nib.");
    }
}

public class Abstract_CWH_Q1 {
    public static void main(String[] args) {
        fountainPen f1 = new fountainPen();
        f1.write();
        f1.refill();
        f1.nib();
    }
}
