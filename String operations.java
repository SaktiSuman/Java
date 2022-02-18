package demo.java;
import java.util.ArrayList;

public class StringOperationsDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Delhi");
        list1.add("Mumbai");
        list1.add("Jalandhar");
        list1.add("Chennai");
        list1.add("Cuttack");
        list1.add("Bhubaneswar");

        System.out.println("Printing all the elements: ");
        list1.stream().forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Sorting: ");
        list1.stream().sorted().forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Skipping some of the elements from first position: ");
        list1.stream().skip(3).forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Counting the number of the elements in the array: ");
        System.out.print("Number of elements is "+list1.stream().count());
        System.out.println("");

        System.out.println("Displaying the given number of elements of the array: ");
        list1.stream().limit(3).forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Filtering the elements in the " +
                "array that contain 7 or more than 7 chatracters: ");
        list1.stream().filter(a->a.length()>=7).forEach(a-> System.out.print(a+" "));
        System.out.println("");
    }
}
