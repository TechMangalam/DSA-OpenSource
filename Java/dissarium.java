class DISSARIUM
{
    static void main(int n)
    {
        System.out.println("Entered number="+n);
        int temp=n,d;
        double sum=0;
        String s=Integer.toString(n);
        int len=s.length();
        while (temp>0)
        {
            d=temp%10;
            sum=sum+Math.pow(d,len);
            len--;
            temp=temp/10;
        }
        if(sum==n)
        System.out.println("Dissarium number="+n);
        else
        System.out.println("Not Dissarium number="+n); //this is latest update
    }
}
        
