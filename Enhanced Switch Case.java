import java.util.Scanner;
public class EnhancedSwicth {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ob.next();
        switch (name) {
            case "Sakti" -> {
                System.out.println("You are going to get a job.");
                System.out.println("You are going to fulfill all your family requirements.");
                System.out.println("You are going to buy a luxirous car..");
            }
            case "Akash" -> System.out.println("You are going to excel in BWOOD");
            case "Bithal" -> System.out.println("You are going to become a leading enterpreneur");
            default -> System.out.println("Enjoy your life!!");
        }
        System.out.println("Thanks for using my java code.");
    }
}
