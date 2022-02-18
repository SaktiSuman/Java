public class DetectingDoubleTripleSpaces {
    public static void main(String[] args) {
        String my_string = "This  Contains    Double and triple Strings";
        System.out.println(my_string.indexOf("  "));
        System.out.println(my_string.indexOf("   "));
        //If there will be no double or triple spaces then -1 will be printed.
    }
}
