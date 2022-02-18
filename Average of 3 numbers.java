import java.util.Scanner;
public class Average_of_numbers {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = ob.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = ob.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = ob.nextInt();
        float avg = (a + b + c)/3;
        System.out.println("The average of 3 numbers is: "+avg);
    }
}
