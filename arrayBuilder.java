import java.util.Scanner;

public class arrayBuilder {

    private int rows;
    private int columns;

    private Scanner numberScanner = new Scanner(System.in);

    private int[][] array;

    private int sum = 0;
    private int count = 0;

    private int number = 0;

    // Constructor that prints output
    public arrayBuilder() {
        constructArray();

        buildArray(array);
        System.out.println("");
        System.out.println("Filled Array: ");
        printArray(array);

        System.out.println("");
        rowSum(array);

        System.out.println("");
        colSum(array);
    }

    // Builds array based on user input
    public void constructArray() {
        System.out.print("How many rows do you want the array to have?: ");
        rows = numberScanner.nextInt();

        System.out.print("How many columns do you want the array to have?: ");
        columns = numberScanner.nextInt();

        array = new int[rows][columns];
    }

    // Fills array with user defined numbers
    public void buildArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print("Enter a number to insert in row " + (row + 1) + ", column " + (col + 1));
                array[row][col] = numberScanner.nextInt();
            }
        }
    }

    // Uses enhanced nested loops to print array
    public void printArray(int[][] array) {
        for (int[] row : array) {
            for (int thing : row) {
                System.out.print(thing);
            }
            System.out.println();
        }
    }

    // Calculates and prints sum of each row
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

    // Calculates and prints sum of each column
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