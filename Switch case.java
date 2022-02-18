import java.util.Scanner;
public class CWH_SwitchCaseStatements {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ob.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to be an adult.");
                break;
            case 23:
                System.out.println("You are going to join a job.");
                break;
            case 60:
                System.out.println("You are going to retire.");
                break;
            default:
                System.out.println("Enjoy your life.");
        }
        System.out.println("Thanks for using my java code.");
    }
}
