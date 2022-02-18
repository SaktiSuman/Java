import java.util.Scanner;
public class KilometersToMeters {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        float km = ob.nextFloat();
        float m = km * 1000;
        System.out.println("The distance in meters is: "+m+"m");
    }
}
