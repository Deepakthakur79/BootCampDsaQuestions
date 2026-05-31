// matrix digonal difference
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        // Input matrix
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int primary = 0;
        int secondary = 0;

        // Find diagonal sums
        for (int i = 0; i < n; i++) {

            primary += mat[i][i];

            secondary += mat[i][n - 1 - i];
        }

        int difference = primary - secondary;

        System.out.println("Diagonal Difference = " + difference);
    }
}