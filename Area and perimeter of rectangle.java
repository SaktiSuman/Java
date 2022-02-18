import java.util.Scanner;
public class Area_and_Perimeter_of_Rectangle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        float l = ob.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        float b = ob.nextFloat();
        float area = l * b;
        float perimeter = 2 * (l + b);
        System.out.println("Area of the rectangle: "+area);
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }
}
