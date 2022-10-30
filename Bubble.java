import java.util.*;
class Bubble
{
    static void main()
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter Number of Elements You Want to Input:");
        int len=sn.nextInt();
        int n[]=new int[len];
        int i,temp;
        for(i=0;i<=len-1;i++)
        {
            System.out.print("Enter Numbers:");
            n[i]=sn.nextInt();
        }
        for(i=0;i<=len-1;i++)
        {
            for(int j=0;j<=len-2;j++)
            {
                if(n[j]>n[j+1])
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(i=0;i<=len-1;i++)
        {
            System.out.print(" "+n[i]);
        }
    }
}