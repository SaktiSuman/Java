import java.util.Scanner;
public class StudentReportCard {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your marks in maths: ");
        float maths = ob.nextFloat();
        System.out.println("Enter your marks in physics: ");
        float physics = ob.nextFloat();
        System.out.println("Enter your marks in chemistry: ");
        float chemistry = ob.nextFloat();
        float avg = (maths + physics + chemistry)/3.0f;
        System.out.println("You avg marks is: "+avg);
        if(avg >= 40 && maths >= 33 && physics >= 33 && chemistry >= 33){
            System.out.println("You are passed the examination..");
        }
        else{
            System.out.println("You have failed the examination..");
        }
    }
}
