import java.util.Scanner;
public class Marks_to_percentage {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the full marks for each subject: ");
        float full_marks = ob.nextFloat();
        System.out.println("Enter the marks for sub1: ");
        float a = ob.nextFloat();
        System.out.println("Enter the marks for sub2: ");
        float b = ob.nextFloat();
        System.out.println("Enter the marks for sub3: ");
        float c = ob.nextFloat();
        System.out.println("Enter the marks for sub4: ");
        float d = ob.nextFloat();
        System.out.println("Enter the marks for sub5: ");
        float e = ob.nextFloat();
        float percentage_of_marks = ((a + b + c + d + e)/(5 * full_marks)) * 100;
        System.out.println("The percentage of marks obtained: "+percentage_of_marks);
    }
}
