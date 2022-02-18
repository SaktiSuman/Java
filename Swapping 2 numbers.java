import java.util.Scanner;
public class Swapping_two_numbers {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = ob.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = ob.nextInt();
        System.out.println("Before swapping a is "+a+" and b is "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a is "+a+" and b is "+b);

    }
}
