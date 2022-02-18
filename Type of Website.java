import java.util.Scanner;
public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the website link: ");
        String website = ob.nextLine();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website..");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website..");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website..");
        }
        else{
            System.out.println("Invalid website link..");
        }
    }
}
