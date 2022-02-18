import java.util.Scanner;
public class Multiplication_Table_Reverse {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number whose reverse table you want: ");
        int n = ob.nextInt();
        for(int i = 10; i >= 1; i--){
            System.out.println(n+" X "+i+" = "+n * i);
        }
    }
}
