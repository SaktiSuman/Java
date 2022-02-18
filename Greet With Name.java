import java.util.Scanner;
public class Greet_with_name {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ob.nextLine();
        System.out.println("Hello "+name+", have a good day!");
    }
}
