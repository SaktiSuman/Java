import java.util.Scanner;
public class CheckingPresenceOfElement {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = ob.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i<arr.length;i++){
            arr[i] = ob.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int element = ob.nextInt();
        int flag = 0;
        for (int j : arr) {
            if (element == j) {
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
