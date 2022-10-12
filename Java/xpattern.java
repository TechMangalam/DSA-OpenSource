import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n= scn.nextInt();
        
        int r=n;
        int l=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {   
                if(j==l || j==r)
                System.out.print("*	");
                
                else
                System.out.print("	");
            }
            
            l++;
            r--;
            
            
            
            
            System.out.println(); // This is xpattern program.
        }

    }
}
