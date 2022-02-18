import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want: ");
        int n = ob.nextInt();
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial: "+fact);
    }
}
