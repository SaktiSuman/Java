import java.util.Scanner;
public class Arithmetic_operations {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        float a = ob.nextFloat();
        System.out.println("Enter the 2nd number: ");
        float b = ob.nextFloat();
        float sum = a + b;
        float sub = a - b;
        float pro = a * b;
        float div = a / b;
        System.out.println("Sum: "+sum);
        System.out.println("Sub: "+sub);
        System.out.println("Pro: "+pro);
        System.out.println("Div: "+div);
    }
}
