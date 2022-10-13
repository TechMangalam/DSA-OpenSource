import java.util.*;
//start
public class MatrixChainMinMulti{
     static int MatrixChainMin(int p[]){
     
         int n = p.length - 1;
         int m[][] = new int[n][n];
        
         for(int l = 1;l<n;l++){
             for(int i=0;i<n-l;i++){
             int j = i + l ;
             m[i][j] = Integer.MAX_VALUE;
             for(int k=i;k<j;k++){
                 int temp = m[i][k] + m[k+1][j] +p[i]*p[k+1]*p[j+1];
                 if(temp < m[i][j]){
                     m[i][j] = temp;
                 }
             }
        }
     }
     return m[0][n-1];
     }
     public static void main(String args[]){
         Scanner sn = new Scanner(System.in);
         System.out.println("Enter the number of matrices to be multiplied");
         int n = sn.nextInt();
         int P[] = new int[n+1];
         System.out.println("enter the dimensions of matrices as 2 3 4 3 means 2x3,3x4,4x3 -->");
         for(int i=0;i<n+1;i++){
         P[i] = sn.nextInt();
         }
         System.out.println("Minimum operations to perform matrix multiplications are:"+MatrixChainMin(P));
     }
}
