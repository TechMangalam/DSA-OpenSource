import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
   Scanner scn = new Scanner(System.in);
  int n= scn.nextInt();
  int temp=n;
  int count=0;
  for(int i=2; i <= temp; i++)
  {
      while(n%i==0)
      {
      
      
          for(int j=2; j*j<= i; j++)
          {
              if(i%j==0)
              {
                  count++;
                  break;
              }
          }
          if(count ==0)
          System.out.print(i+" ");
          n=n/i;
      }
      
  }
  
  
 }
}
