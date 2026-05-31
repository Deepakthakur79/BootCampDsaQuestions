//reverse each row of the matrix
import java.util.Scanner;
public class ReverseRowMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The reversed row matrix is:");
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}