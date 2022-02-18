import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number whose table you want to display: ");
        int a = ob.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(a + " X " + i +" = "+a*i);
        }
    }
}
