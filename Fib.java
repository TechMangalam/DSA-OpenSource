class Fibonacci
{
    static void main(int n)
    {
        int a=0,b=1,c,i;
        System.out.println("Fibonacci Series is \n:"+a);
        System.out.println(b);
        for(i=1;i<=n-2;i++)
        {
          c=a+b;
          System.out.println(c);
          a=b;
          b=c;
        }
    }
}
