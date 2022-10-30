//Basic Pattern Problems

/*
****
****
****
****
public class Pattern{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<4;i++)
        {         //outer loops perform operation on rows
        for(j=0;j<4;j++)                                                   
        {         //inner loops perform operation on columns
            System.out.print("*");
        }
        System.out.println("");
    }
    }
} */

/*
****
*  *
*  *
****
public class Pattern{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<4;i++)
        {         //outer loops perform operation on rows
        for(j=0;j<4;j++)
        {         //inner loops perform operation on columns
            if(i==0 || j==0 || i==3 || j==3)
            {
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}*/

/*
*
**
***
****
public class Pattern{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<4;i++)
        {         //outer loops perform operation on rows
        for(j=0;j<=i;j++)
        {         //inner loops perform operation on columns
            System.out.print("*");
        }
        System.out.println();
    }
    }
}*/

/* inverted half pyramid
****
***
**
*
public class Pattern{
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<4;i++) or for(i=3;i>=0;i--)
        {         //outer loops perform operation on rows
        for(j=0;j<=3-i;j++) or for(j=0;j<=i;j++)
        {         //inner loops perform operation on columns
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
*/
/*half pyramid rotated by 180 degree
   *
  **
 ***
****
public class Pattern{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {         //outer loops perform operation on rows
        for(j=1;j<=4;j++)
        {         //inner loops perform operation on columns
            if(j<=4-i)
            System.out.print(" ");
            else
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
or
public class Patterns {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=n; i>=1; i--) {
           for(int j=1; j<i; j++) {
               System.out.print(" ");
           }
 
           for(int j=0; j<=n-i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
*/

/*
1
12
123
1234

public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
 }
*/

/*
12345
1234
123
12
1
 
public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=6-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
 }
 */
/*Floyd's triangle
1
23
456
78910
public class Pattern {
    public static void main(String args[]) {
        int count=1;
        int n=4;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
 }*/

/*
1
01
101
0101
public class Pattern {
   public static void main(String args[]) {
       for(int i=1; i<=4; i++) {
           for(int j=1; j<=i; j++) {
               if((i+j)%2==0){
               System.out.print("1");
               }
               else{
               System.out.print("0");
               }

           }
           System.out.println();
       }
   }
}
*/

//Advanced Pattern Problems
/*
Butter-fly Pattern 
*     *
**   **
*** ***
*******
*******
*** ***
**   **
*     *
 
public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        int space;
        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) { // inner loops perform operation on columns
                if (j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space=2*(n-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space=2*(n-i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
*/
/*
    *****
   *****
  *****
 *****
*****

public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        int space;
        for (int i = 1; i<=n; i++) {
            space=n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        int space;
        for (int i = 1; i<=n; i++) {
            space=n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
*/

/*
    1
   212
  32123
 4321234
543212345

public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        int space;
        for (int i = 1; i<=n; i++) {
            space=n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/

/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        int space;
        for (int i = 1; i<=n; i++) {
            space=n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--) {
            space=n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
