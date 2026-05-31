//insert row and column at given position in the matrix insert and delete
import java.util.Scanner;
public class MatrixInsertDelete{
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
        
        System.out.println("Enter the row index inserted:");
        int RowIndex = sc.nextInt();
       int newMat[][] = new int[n+1][n];
       int newRow[] = new int[n];
         System.out.println("Enter the new row elements:");
        for(int j=0;j<n;j++){
            newRow[j] = sc.nextInt();
        }
        for(int i=0;i<n+1;i++){
            if(i<RowIndex){
                for(int j=0;j<n;j++){
                    newMat[i][j] = mat[i][j];
                }
            }else if(i==RowIndex){
                for(int j=0;j<n;j++){
                    newMat[i][j] = newRow[j];
                }
            }else{
                for(int j=0;j<n;j++){
                    newMat[i][j] = mat[i-1][j];
                }
            }
        }
        System.out.println("The matrix after row insertion :");
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n;j++){
                System.out.print(newMat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the row index to be deleted:");
        int deleteRow = sc.nextInt();
        int deleteMat[][] = new int[n][n];
        int k = 0;
        for(int i=0;i<n+1;i++){
            if(i==deleteRow){
                continue;
            }
            for(int j=0;j<n;j++){
                deleteMat[k][j] = newMat[i][j];
            }
            k++;
        }
        System.out.println("The matrix after row deletion :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(deleteMat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}