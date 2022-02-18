public class MatrixAddition {
    static void addition(int[][] myArray, int[][] myArray2){
        int[][] myArray3 = new int[myArray.length][myArray[0].length];
        for (int i = 0;i< myArray.length;i++){
            for (int j = 0;j<myArray[0].length;j++){
                myArray3[i][j] = myArray[i][j] + myArray2[i][j];
                System.out.print(myArray3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static void display(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] myArray1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] myArray2 = {{4,5,6},{7,8,9},{10,11,12}};
        System.out.println("1st matrix");
        display(myArray1);
        System.out.println("2nd matrix");
        display(myArray2);
        System.out.println("Addition: ");
        addition(myArray1, myArray2);
    }
}
