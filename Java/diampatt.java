import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        
        int str= 1;
        int sp= n/2;
        
        for (int i=1;i<=n; i++)
        {
            
            for(int j=1; j<=sp; j++)
            {
                System.out.print("	");
            }
            
            for(int j=1;j<=str; j++)
            {
                System.out.print("*	");
            }
            
            if(i<=n/2)
            {
                str=str+2;
                sp--;
            }
            else
            {
                sp++;
                str=str-2;
            }
            
            System.out.println();
        }
        

    }
}
