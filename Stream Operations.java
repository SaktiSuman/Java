package demo.java;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Integer arr[] = {11, 11, 234, 234, 10, 78 ,990 ,10 , 99, 78, 890};
        Stream.of(arr).forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Remove duplicates: ");
        Stream.of(arr).distinct().forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Map:");
        Stream.of(arr).map(a->a*a).forEach(a-> System.out.print(a+" "));
        System.out.println("");

        System.out.println("Sorted: ");
        Stream.of(arr).sorted().forEach(a-> System.out.print(a+" "));
        System.out.println("");
    }
}
