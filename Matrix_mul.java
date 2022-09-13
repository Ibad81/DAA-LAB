import java.util.Scanner;

public class Matrix_mul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int [n][m];
        int [][] b=new int [n][m];
        int [][] c=new int [n][m];
        System.out.println("Enter first Matrix");
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second Matrix");
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=0;
                for (int k = 0; k < n; k++) {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
