import java.util.Scanner;

public class BoundarySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println("Sum of boundary elements = " + sum);
    }
}