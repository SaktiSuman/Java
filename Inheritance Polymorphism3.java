abstract class Telephone{
    abstract void lift();
    abstract void disconnected();
}
class smartTelephone extends Telephone{
    public void lift(){
        System.out.println("Phone lifted");
    }
    public void disconnected(){
        System.out.println("Phone disconnected");
    }
    public void takeSnaps(){
        System.out.println("Clicked Pics");
    }
    public void recordVideos(){
        System.out.println("Videos Recorded");
    }
}

public class Abstract_CWH_Q3 {
    public static void main(String[] args) {
        Telephone t1 = new smartTelephone();
        System.out.println("------------------------");
        System.out.println("Telephone functions..");
        System.out.println("------------------------");
        t1.lift();
        t1.disconnected();

        smartTelephone t2 = new smartTelephone();
        System.out.println("------------------------");
        System.out.println("SmartPhone functions..");
        System.out.println("------------------------");
        t2.lift();
        t2.disconnected();
        t2.takeSnaps();
        t2.recordVideos();
    }
}
