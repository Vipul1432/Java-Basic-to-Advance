import java.util.Scanner;

public class TwoD_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of column");
        int col = sc.nextInt();

        int[][] thisIsArray = new int[row][col];

        System.out.println("Enter the array elements");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                thisIsArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the array\n=============");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(thisIsArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}