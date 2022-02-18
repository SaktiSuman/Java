import java.util.Scanner;
public class EncryptingDecryptingGrade {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char ch = ob.next().charAt(0);
        ch = (char) (ch + 8);
        System.out.println("Encrypting: ");
        System.out.println(ch);
        ch = (char) (ch - 8);
        System.out.println("Decrypting: ");
        System.out.println(ch);
    }
}
