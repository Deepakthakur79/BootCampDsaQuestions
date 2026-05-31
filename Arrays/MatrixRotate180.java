//rotate matrix by 180 degrees
import java.util.Scanner;

public class MatrixRotate180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        // Input matrix
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix after 180 degree rotation:");

        // Print from last row and last column
        for (int i = r - 1; i >= 0; i--) {

            for (int j = c - 1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }
}