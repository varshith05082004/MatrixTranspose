import java.util.Scanner;
public class MatrixTranspose{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the no.of columns:");
        int cols=sc.nextInt();
        int[][] mat=new int[rows][cols];
        int[][] transpose=new int[rows][cols];
        System.out.println("Enter elements of matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=mat[i][j];
            }
            System.out.println();
        }
        System.out.println("transpose Matrix:");
        // System.out.println(add);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}