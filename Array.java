import java.util.*;
public class Array {
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        int row=sn.nextInt();
        int col=sn.nextInt();
        int a[][]=new int[row][col];   // a.length can be sued for array length
        System.out.println("Enter no.:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                
                a[i][j]=sn.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
