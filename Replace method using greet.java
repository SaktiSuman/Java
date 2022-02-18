import java.util.Scanner;
public class ReplaceMethodUsedToGreet {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String greet = "Dear <|name|>, Thanks a lot!";
        System.out.println("Enter your name: ");
        String name = ob.next();
        System.out.println(greet.replace("<|name|>", name));
    }
}
