import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        float arr[] = new float[5];
        float sum = 0;
        for (int i = 0; i< arr.length;i++){
            arr[i] = ob.nextFloat();
            sum += arr[i];
        }
        System.out.println("Sum is: "+sum);
    }
}
