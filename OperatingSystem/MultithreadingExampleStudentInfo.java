
import java.util.Arrays;
import java.util.Scanner;

public class MultithreadingExampleStudentInfo  {
	
	String str;

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		StudentInfo stin = new StudentInfo();
		
		System.out.println("Enter your full name and roll no -->");
		
		stin.str = sn.nextLine();
		
		ReverseThread rt1 = new ReverseThread(stin.str);
		rt1.start();
		
		PermutThread pt1 = new PermutThread(stin.str);
		System.out.println("\n\n Permutations --> \n");
		pt1.start();
		
		RearrangeThread rat1 = new RearrangeThread();
		System.out.println("\n\n Rearranged firstname --> \n");
		rat1.start();

	}	
}

class ReverseThread extends Thread{
	
	String str;
	
	public ReverseThread(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		System.out.println("Reversed String --> "+reverse(str));
	}
	
	String reverse(String s) {
		
		String rev="";
		int pre =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ' && i<s.length()-1) {
				rev = s.substring(pre, i)+" "+rev;
				pre = i+1;
			}else if(i==s.length()-1) {
				rev = s.substring(pre) +" "+ rev;
				pre = i+1;
			}
		}
		
		return rev;
	}
	
}

class PermutThread extends Thread{
	
	String str;
	
	public PermutThread(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		permutate(str.substring(0, 4),0,3);
	}
	
	void permutate(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permutate(str, l + 1, r); 
                str = swap(str, l, i); 
            } 
        } 
    } 
  
    
    String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
	
}

class RearrangeThread extends Thread{
	
	@Override
	public void run() {
		
		char str[] = "mangalam".toCharArray();  
	    int n = str.length;  
	   
	    char []out = new char[n];  
	  
	    if (rearrange(str, out, 4)==1)  
	            System.out.println(String.valueOf(out)); 
	    else
	            System.out.println("Cannot be rearranged"); 
	} 
		
	
	static int MAX_CHAR = 256;  
	  
	
	static int nextChar(int freq[], int dist[])  
	{  
	    int max = Integer.MIN_VALUE;  
	    for (int i = 0; i < MAX_CHAR; i++)  
	        if (dist[i] <= 0 && freq[i] > 0 &&  
	        (max == Integer.MIN_VALUE || freq[i] > freq[max]))  
	                max = i;  
	  
	    return max;  
	}  
	  
	 //201951089-->2+5+9=16-->16/2=8-->8/2=4
	// so d=4;
	static int rearrange(char str[], char out[], int d)  
	{  
	    
	    int n = str.length;  
	  
	    int []freq = new int[MAX_CHAR];  
	  
	    for (int i = 0; i < n; i++)  
	        freq[str[i]]++;  
	  
	    int []dist = new int[MAX_CHAR];  
	  
	    for (int i = 0; i < n; i++)  
	    {  
	        
	        int j = nextChar(freq, dist);  
	  
	        if (j == Integer.MIN_VALUE)  
	            return 0; 
	        out[i] = (char) j;
	        freq[j]--;
	        dist[j] = d;  
	  
	        for (int k = 0; k < MAX_CHAR; k++)  
	            dist[k]--;  
	    }  
	        Arrays.copyOfRange(out, 0, n); 
	     
	    return 1;  
	}  
	
}
