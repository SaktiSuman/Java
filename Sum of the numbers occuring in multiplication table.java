import java.util.Scanner;
public class Sum_OF_Table_Products {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = ob.nextInt();
        int sum = 0;
        for(int i = 1;i <= 10; i++){
            sum += n * i;
        }
        System.out.println("Sum is: "+sum);
    }
}
