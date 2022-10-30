import java.util.Scanner;

public class bubbleSort
{
    
    public int[] insertData()
    {
        Scanner sn=new Scanner (System.in);
        System.out.println("enter size of data list--> ");
        int s;
        s = sn.nextInt();
        int d[];
        d= new int[s];

        for(int i=0;i<s;i++)
        {
            System.out.println("enter "+(i+1)+"  data --> ");
            d[i]=sn.nextInt();
        }
        return d;
    
    }
    public void bubbleSorting(int[] d,int s)
    {
        int temp=0;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s-1;j++)
            {
                if(d[j]>d[j+1])
                {
                    temp=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp;
    
                }
                temp=0;
            }
        }
    
    }
    
    public void printSortedData(int s,int[] d)
    {
        System.out.println("Data after sorting-->");
        for(int i=0;i<s;i++)
        {
            System.out.println("  "+d[i]);
        }

    
    }
public static void main(String[] args)
{
    bubbleSort b=new bubbleSort();
    int data[];
    int size;
    
    data=b.insertData();
    size=data.length;
    b.bubbleSorting(data,size);
    b.printSortedData(size,data);
    

    
}
}