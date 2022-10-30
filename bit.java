import java.util.*;
public class bit {
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int x=0,i=0;
        while(i<n){
            String s=sn.next();
            if(s.charAt(i)=='+' || s.charAt(i+1)=='+'){
                x++;
            }
            else{
                x--;
            }
            i++;
        }
        System.out.println(x);
    }
}