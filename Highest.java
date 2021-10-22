import java.util.*;
class Highest
{
    static void main()
    {
        Scanner sn=new Scanner(System.in);
        int r,c;
        System.out.print("Enter Number of Rows Required:");
        r=sn.nextInt();
        System.out.print("Enter Number of Columns Required:");
        c=sn.nextInt();
        int n[][]=new int[r][c];
        int i,j;
        int h=n[0][0];
        for(i=0;i<=r-1;i++)
        {
            for(j=0;j<=c-1;j++)
            {
                System.out.print("Enter Elements:");
                n[i][j]=sn.nextInt();
            }
        }
        for(i=0;i<=r-1;i++)
        {
            for(j=0;j<=c-1;j++)
            {
                if(h<n[i][j])
                h=n[i][j];
            }
        }
        System.out.print("Highest:"+h);
    }
}