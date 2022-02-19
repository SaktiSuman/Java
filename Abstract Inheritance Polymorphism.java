interface tvRemote{
    void powerOn();
    void volume();
}
interface smartTvRemote extends tvRemote{
    void mediaPlayer();
    void smartMode();
}
class Tv implements tvRemote{
    public void powerOn(){
        System.out.println("Power is on");
    }
    public void volume(){
        System.out.println("Changing the volume settings.");
    }
    public void cameraMode(){
        System.out.println("Changing to camera mode.");
    }
}

public class Abstract_CWH_Q4 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.powerOn();
        t1.volume();
        t1.cameraMode();
    }
}
