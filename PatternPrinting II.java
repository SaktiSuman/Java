import java.util.Scanner;
public class Pattern_Printing {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of lines of the pattern: ");
        int n = ob.nextInt();
        for(int i = n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
