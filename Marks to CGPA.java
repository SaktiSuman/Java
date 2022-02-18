import java.util.Scanner;
public class CGPA_from_marks {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the marks for subject 1: ");
        float a = ob.nextFloat();
        System.out.println("Enter the marks for subject 2: ");
        float b = ob.nextFloat();
        System.out.println("Enter the marks for subject 3: ");
        float c = ob.nextFloat();
        float cgpa = (a + b + c)/30;
        System.out.println(cgpa);
    }
}
