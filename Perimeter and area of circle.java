import java.util.Scanner;
public class Area_and_Perimeter_of_Circle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = ob.nextInt();
        double perimeter = 2 * 3.14 * r;
        double area = 3.14 * r * r;
        System.out.println("Perimeter of the circle: "+perimeter);
        System.out.println("Area of the circle: "+area);
    }
}
