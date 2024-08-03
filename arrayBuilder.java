import java.util.Scanner;

public class arrayBuilder {

    private int rows;
    private int columns;
    private Scanner numberScanner = new Scanner(System.in);
    private int[][] array;
    private int sum = 0;
    private int count = 0;

    public arrayBuilder() {
        buildInitialArray();
        System.out.println("Initial Array: ");
        printArray(array);
        System.out.println("");

        buildArray1(array);
        System.out.println("");
        System.out.println("Filled Array: ");
        printArray(array);

        System.out.println("");
        rowSum(array);

        System.out.println("");
        colSum(array);
    }

    public void buildInitialArray() {
        System.out.print("How many rows do you want the array to have?: ");
        rows = numberScanner.nextInt();
        System.out.print("How many columns do you want the array to have?: ");
        columns = numberScanner.nextInt();
        array = new int[rows][columns];
    }

    public void buildArray1(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = (int) (Math.random() * 10);
            }
        }
    }

    public void printArray(int[][] array) {
        for (int[] row : array) {
            for (int thing : row) {
                System.out.print(thing);
            }
            System.out.println();
        }
    }

    public void rowSum(int[][] array) {
        for (int[] x : array) {
            int total = 0;
            for (int n : x) {
                total += n;
            }
            count++;
            System.out.println("The sum of row " + count + " is: " + total);
        }
    }

    public void colSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            System.out.println("The sum of column " + (i + 1) + " is: " + sum);
            sum = 0;
        }
    }

}