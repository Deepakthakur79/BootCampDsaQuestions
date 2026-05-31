//calculate highest sum of row and delete that row from the matrix
import java.util.Scanner;
public class MatrixRowDelete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += mat[i][j];
            }
            System.out.println("Sum of row " + i + " = " + sum);
            if(sum>maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("The row index with the highest sum is: " + maxRow);
        System.out.println("The matrix after deleting the row is:");
        for(int i=0;i<n;i++){
            if(i==maxRow){
                continue;
            }
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}