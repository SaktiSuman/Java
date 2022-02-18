import java.util.Scanner;
public class Sum_1st_n_Even_numbers {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = ob.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("Sum: "+sum);
    }
}
