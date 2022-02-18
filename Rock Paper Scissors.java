import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Random  ra= new Random();
        System.out.println("1->Rock\n2->Paper\n3->Scissors");
        System.out.println("Enter your choice..");
        int user = ob.nextInt();
        int computer = ra.nextInt(1,4);
        System.out.println("User's Choice: "+user);
        System.out.println("Computer's Choice: "+computer);
        if(user == 1 && computer == 3){
            System.out.println("You won!");
        }
        else if(user == 3 && computer == 1){
            System.out.println("Computer Won!");
        }
        else if(user > computer){
            System.out.println("You won!");
        }
        else if(computer > user){
            System.out.println("Computer won!");
        }
        else if(user == computer){
            System.out.println("Game tied!");
        }
    }
}
