import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean b1 = ob.hasNextInt();
        System.out.println(b1);
    }
}
