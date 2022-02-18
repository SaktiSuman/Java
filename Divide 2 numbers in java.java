import java.util.Scanner;
public class Divide_two_numbers {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        float a = ob.nextFloat();
        System.out.println("Enter the 2nd number: ");
        float b = ob.nextFloat();
        float div = a/b;
        System.out.print("The division of the both the numbers is: ");
        System.out.println(div);
    }
}
