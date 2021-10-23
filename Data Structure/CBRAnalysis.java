import java.util.*;

class CBRAnalysis{
    
    public void countingSort(int[] a,int[] b,int n,int k){
        
        int c[] = new int[k];
       
        for(int i=0;i<k;i++){
            c[i] = 0;
        }
        
        for(int i =0;i<n;i++){
            c[a[i]] = c[a[i]] + 1;
        }
        
        for(int i=1;i<k;i++){
            c[i] = c[i] + c[i-1];
        }
        
        for(int i=n-1;i>=0;i--){
            b[c[a[i]]-1] = a[i];
            c[a[i]] = c[a[i]] - 1;
        }
        
    }
    
    public void countingSortRadix(int[] a,int n,int exp){
        
        int c[] = new int[10];
        int b[] = new int[n];
        for(int i=0;i<10;i++){
            c[i] = 0;
        }
        
        for(int i =0;i<n;i++){
            c[(a[i]/exp)%10] = c[(a[i]/exp)%10] + 1;
        }
        
        for(int i=1;i<10;i++){
            c[i] = c[i] + c[i-1];
        }
        
        for(int i=n-1;i>=0;i--){
            b[c[(a[i]/exp)%10]-1] = a[i];
            c[(a[i]/exp)%10] = c[(a[i]/exp)%10] - 1;
        }
        
        for(int i =0;i<n;i++){
            a[i] = b[i];
        }
       
    
    }
    
    int getMaxEleInArray(int a[]){
        int maxEle=0;
        for(int i=0;i<a.length;i++){
            if(maxEle < a[i]){
                maxEle = a[i];
            }
        }
        return maxEle;
    }
    
    public void radixSort(int a[]){
        int m = getMaxEleInArray(a);
        
        for(int exp = 1;m/exp>0;exp*=10){
            countingSortRadix(a,a.length,exp);
        }
    }
    
    int partition(float a[], int low, int high) 
    { 
        float pivot = a[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (a[j] < pivot) 
            { 
                i++; 
                float temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
        float temp = a[i+1]; 
        a[i+1] = a[high]; 
        a[high] = temp; 
        return i+1; 
    } 
    void sortQuick(float a[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(a, low, high); 
            sortQuick(a, low, pi-1); 
            sortQuick(a, pi+1, high); 
        } 
    } 
    
    void bucketSort(float a[]){
       
        ArrayList<ArrayList<Float>> b= new ArrayList<ArrayList<Float>>();
        int n = a.length;
        
      
        for(int i =0;i<a.length;i++){
            if(b.contains((int)(10*a[i]))){
                b.get((int)(10*a[i])).add(a[i]);
            }
        }
        for(int i = 0;i<n;i++){
            //
            if(b.contains((int)(10*a[i]))){
                //sortQuick(b.getFloatArray(i),0,(b.get(i).size())-1);
                Collections.sort(b.get(i));
            }
        }
        int index=0,bIndex=0,bNo=0;
        
        while(bNo < 10){
            if(b.contains(bNo)){
                if(b.get(bNo).get(bIndex) == 0 && bNo != 0){
                    bIndex++;
                }else{
                    a[index++] = b.get(bNo).get(bIndex);
                    bIndex++;
                }
                if(bIndex == b.get(bNo).size()){
                    bNo++;
                }
            }else{bNo++;}
        }
    }
    
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        
        CBRAnalysis cbr = new CBRAnalysis();
        
        int a[],b[];
        float c[];
        long t1=0,t2=0;
        int op=1;
        double tCount[] = new double[15];
        double Avg=0;
        
        for(int z=1;z<=5;z++){
            a = new int[2000*z];
            b = new int[2000*z];
            c = new float[2000*z];
            
            System.out.println("Execution time for "+a.length+" elements array -->\n");
            /* --- Counting Sort --- */
            for(int l=0;l<15;l++){
                
                for(int i = 0;i<a.length;i++){
                   a[i] = (int)(Math.random()*(i));
                }
                t1 = System.nanoTime();
                cbr.countingSort(a,b,a.length,a.length);
                t2 = System.nanoTime();    
                tCount[l] = ((double)(t2-t1)/(double)1000);
                t1=0;t2=0;
            }
            for(int i=0;i<15;i++){
                Avg = Avg + tCount[i]; 
            }
            System.out.println("Average time taken by Counting sort--> "+Avg/15+"  micro seconds\n");
            Avg = 0;
            
            /* --- Radix Sort --- */
            for(int l=0;l<15;l++){
                
                for(int i = 0;i<a.length;i++){
                   a[i] = (int)(Math.random()*(i));
                }
                t1 = System.nanoTime();
                cbr.radixSort(a);
                t2 = System.nanoTime();    
                tCount[l] = ((double)(t2-t1)/(double)1000);
                t1=0;t2=0;
            }
            for(int i=0;i<15;i++){
                Avg = Avg + tCount[i]; 
            }
            System.out.println("Average time taken by Radix sort--> "+Avg/15+"  micro seconds\n");
            Avg = 0;
            
            /* --- Bucket Sort --- */
            for(int l=0;l<15;l++){
                
                for(int i = 0;i<c.length;i++){
                   c[i] = (float)Math.random();
                }
                t1 = System.nanoTime();
                cbr.bucketSort(c);
                t2 = System.nanoTime();    
                tCount[l] = ((double)(t2-t1)/(double)1000);
                t1=0;t2=0;
            }
            for(int i=0;i<15;i++){
                Avg = Avg + tCount[i]; 
            }
            System.out.println("Average time taken by Bucket sort--> "+Avg/15+"  micro seconds\n");
            Avg = 0;
            
        }
        
    }
    
}
