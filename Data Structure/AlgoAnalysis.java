
import java.util.*;

class AlgoAnalysis{
    
    public void linearSearch(int[] arr,int element){
        
        //declaration of size to store size of array
        int size = arr.length;
        
        //for loop to iterate through array arr from start to end index
        for(int i=0;i<size;i++){
            
            /*  we found element if array element at index i is equal 
             * to search element else element not found if i equals size-1 */
            if(arr[i] == element){
                System.out.println("Element found at "+(i+1)+" position ");
                return;
            }else{
                if(i==size-1){
                    System.out.println("Search element not found");
                }
            }
        }
    }
    
    public void binarySearch(int[] arr,int element){
        
        int size = arr.length;//size of array arr
        
        int start =0,end = size-1;
        //intialise start,end and middle index of given array
        int mid = (start+end)/2;
        
        while(start<=end)
        {
            //if search element is at middle index we instantly get answer
            if(arr[mid]==element)
            {
                System.out.println("\nElement found at "+(mid+1)+" position in sorted array");
                return;
            }else if(element<arr[mid]){  
                //search element is less than element middle then set end index to mid-1
                end = mid-1;
                mid = (start+end)/2;
            }else{
                //search element is greater than element middle then set end index to mid+1
                start = mid+1;
                mid = (start+end)/2;
            }
            
        }
        //if start index exceeds end then element not found
        if(start>end){
                System.out.println("\nElement not found ");
            }
    }
    
    public void bubbleSort(int a[])
    {
        int i,j,t;
        int size=a.length;
        
        for(i=0;i<size-1;i++)
        {
            for(j=0;j<size-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
           
        }
        
      
        return ;
    }
    
    public void SelectionSort(int a[])
    {
        int i,j,t,small;
        int size=a.length;
        
        for(i=0;i<size;i++)
        {
            small=i;
            for(j=i+1;j<size;j++)
            {
                if(a[j]<a[small])
                {
                    small=j;
                }
            }
            t=a[i];
            a[i]=a[small];
            a[small]=t;
            
           
        }
        
        return ;
    }
    
    public void InsertionSort(int d[])
    {
        int i,j,s;
        int size = d.length;
        for(i=1;i<size;i++)
       {   s=d[i];
           j=i-1;
           while(j>=0&& d[j]>s)
           {
               d[j+1]=d[j];
               j=j-1;
           }
           
           d[j+1]=s;
           
        }
        
            return ;
    }
    
    
    public static void main(String []args){
        
        Scanner sn = new Scanner(System.in);
        AlgoAnalysis ly = new AlgoAnalysis();
        
        int a[] = new int[10000];
        int b[] = new int[10000];
        int c[] = new int[10000];
        long t1=0,t2=0,op=1;
        double tBest[] = new double[10];
        double tAvg[] = new double[10];
        double tWorst[] = new double[10];
        double tRandom[] = new double[10];
        
        double AvgBest=0,AvgRand=0,AvgWorst=0,AvgRandom=0;
        
        //elements in random order
        for(int i = 0;i<10000;i++){
            a[i] = (int)(Math.random()*(i+5)*3-5) + i;
        }
        //elements in random order is copied to c
        for(int i = 0;i<10000;i++){
            c[i] = a[9999-i];
        }
        //element in a are arranged in ascending order
        Arrays.sort(a);
        //copying elements in a to b in descending order
        for(int i = 0;i<10000;i++){
            b[i] = a[9999-i];
        }
        
        
       
        
        int searchArrayRandom[]={a[6],a[506],a[3006],5567,a[1678],a[5100]
                            ,a[6506],22000,a[8750],a[9900] };
            
        System.out.println("Search array for searching -->");
        
        for(int i = 0;i<searchArrayRandom.length;i++){
            System.out.print(searchArrayRandom[i]+"  ");
            
        }
        System.out.println();
        
        while(op != 0)
        {
            
            System.out.println();
            System.out.println("Enter option: \n1.Linear Search Analysis \n2.Binary Search Analysis \n3.Bubble Sort Analysis ");
            System.out.println("4.Selection Sort Analysis \n5.Insertion Sort Analysis \n0.Exit");
            op = sn.nextInt();
        
        
        
            if(op == 1)
            {
                for(int i=0;i<10;i++){
                
                //System.out.println("-------<<<<<<<<< Round "+(i+1)+" >>>>>>>>>-------");
                
                
                //System.out.println("Search element for best and worst case--> "+a[0]+"\n");
                //System.out.println("Search element for average case--> "+a[5000]+"\n");
                //System.out.println("Search element for random case--> "+searchArrayRandom[i]+"  ");
                
                
            
                t1 = System.nanoTime();
                ly.linearSearch(a,a[0]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by linear search in best case --> ");
                tBest[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.linearSearch(b,a[0]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by linear search in avg case --> ");
                tAvg[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.linearSearch(b,b[9999]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by linear search in worst case --> ");
                tWorst[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.linearSearch(c,searchArrayRandom[i]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by linear search in random case --> ");
                tRandom[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
            }
            
            for(int i=0;i<10;i++){
                AvgBest = AvgBest + tBest[i];
                AvgRand = AvgRand + tAvg[i];
                AvgWorst = AvgWorst + tWorst[i];
                AvgRandom = AvgRandom + tRandom[i];
            }
            
            
            System.out.println("\n\nAverage Time taken by linear search in Random case --> ");
            System.out.println("  "+AvgRandom/10+"  micro second");
            
            System.out.println("Average Time taken by linear search in best case --> ");
            System.out.println("  "+AvgBest/10+"  micro second");
            
            System.out.println("Average Time taken by linear search in average case --> ");
            System.out.println("  "+AvgRand/10+"  micro second");
            
            System.out.println("Average Time taken by linear search in worst case --> ");
            System.out.println("  "+AvgWorst/10+"  micro second");
            
            AvgBest =0;
            AvgRand =0;
            AvgWorst=0;
            AvgRandom=0;
            
            
            }else if(op == 2){
                
                System.out.println();
            
            for(int i=0;i<10;i++){
                
                //System.out.println("-------<<<<<<<<< Round "+(i+1)+" >>>>>>>>>-------");
                
                int searchElement = a[0];
                //System.out.println("Search element for best  case--> "+a[5000]+"\n");
                //System.out.println("Search element for worst  case--> "+40000+"\n");
                //System.out.println("Search element for average case--> "+a[2500]+"\n");
                //System.out.println("Search element for random case--> "+searchArrayRandom[i]+"  ");// This was the update for hacktoberfest 2022 (Abhyuday-> approve it)
                
                
            
                t1 = System.nanoTime();
                ly.binarySearch(a,a[5999]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by binary search in best case --> ");
                tBest[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.binarySearch(c,c[7500]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by binary search in avg case --> ");
                tAvg[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.binarySearch(b,b[4999]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by binary search in worst case --> ");
                tWorst[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.binarySearch(c,searchArrayRandom[i]);
                t2 = System.nanoTime();
                //System.out.print("Time taken by binary search in random case --> ");
                tRandom[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
            }
            
            for(int i=0;i<10;i++){
                AvgBest = AvgBest + tBest[i];
                AvgRand = AvgRand + tAvg[i];
                AvgWorst = AvgWorst + tWorst[i];
                AvgRandom = AvgRandom + tRandom[i];
            }
            
            System.out.println("\n\nAverage Time taken by binary search in Random case --> ");
            System.out.println("  "+AvgRandom/10+"  micro second");
            
            System.out.println("Average Time taken by binary search in best case --> ");
            System.out.println("  "+AvgBest/10+"  micro second");
            
            System.out.println("Average Time taken by binary search in average case --> ");
            System.out.println("  "+AvgRand/10+"  micro second");
            
            System.out.println("Average Time taken by binary search in worst case --> ");
            System.out.println("  "+AvgWorst/10+"  micro second");
            AvgBest =0;
            AvgRand =0;
            AvgWorst=0;
            AvgRandom=0;
              
            }else if(op == 3){
                
                //Bubble sort analysis
            
            for(int i=0;i<10;i++){
                
                //System.out.println("-------<<<<<<<<< Round "+(i+1)+" >>>>>>>>>-------");
                
                t1 = System.nanoTime();
                ly.bubbleSort(b);
                t2 = System.nanoTime();
                //System.out.print("Time taken by bubble sort in worst case --> ");
                tWorst[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.bubbleSort(c);
                t2 = System.nanoTime();
                //System.out.print("Time taken by bubble sort in avg case --> ");
                tAvg[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                
                
                t1 = System.nanoTime();
                ly.bubbleSort(a);
                t2 = System.nanoTime();
                //System.out.print("Time taken by bubble sort in best case --> ");
                tBest[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
            }
            for(int i=0;i<10;i++){
                AvgBest = AvgBest + tBest[i];
                AvgRand = AvgRand + tAvg[i];
                AvgWorst = AvgWorst + tWorst[i];
                //AvgRandom = AvgRandom + tRandom[i];
            }
            
            //System.out.println("\n\nAverage Time taken by bubble sort in Random case --> ");
            //System.out.println("  "+AvgRandom/20+"  micro second");
            
            System.out.println("\n\nAverage Time taken by bubble sort in best case --> ");
            System.out.println("  "+AvgBest/10+"  micro second");
            
            System.out.println("Average Time taken by bubble sort in average case --> ");
            System.out.println("  "+AvgRand/10+"  micro second");
            
            System.out.println("Average Time taken by bubble sort in worst case --> ");
            System.out.println("  "+AvgWorst/10+"  micro second");
            
            AvgBest =0;
            AvgRand =0;
            AvgWorst=0;
            AvgRandom=0;
                
            }else if(op == 4){
                
                //selection sort analysis
            
            for(int i=0;i<10;i++){
                
                //System.out.println("-------<<<<<<<<< Round "+(i+1)+" >>>>>>>>>-------");
                
                t1 = System.nanoTime();
                ly.SelectionSort(b);
                t2 = System.nanoTime();
                //System.out.print("Time taken by selection sort in worst case --> ");
                tWorst[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.SelectionSort(c);
                t2 = System.nanoTime();
                //System.out.print("Time taken by selection sort in avg case --> ");
                tAvg[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                
                
                t1 = System.nanoTime();
                ly.SelectionSort(a);
                t2 = System.nanoTime();
                //System.out.print("Time taken by selection sort in best case --> ");
                tBest[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
            }
            for(int i=0;i<10;i++){
                AvgBest = AvgBest + tBest[i];
                AvgRand = AvgRand + tAvg[i];
                AvgWorst = AvgWorst + tWorst[i];
                //AvgRandom = AvgRandom + tRandom[i];
            }
            
            //System.out.println("\n\nAverage Time taken by bubble sort in Random case --> ");
            //System.out.println("  "+AvgRandom/20+"  micro second");
            
            System.out.println("\n\nAverage Time taken by selection sort in best case --> ");
            System.out.println("  "+AvgBest/10+"  micro second");
            
            System.out.println("Average Time taken by selection sort in average case --> ");
            System.out.println("  "+AvgRand/10+"  micro second");
            
            System.out.println("Average Time taken by selection sort in worst case --> ");
            System.out.println("  "+AvgWorst/10+"  micro second");
            
            AvgBest =0;
            AvgRand =0;
            AvgWorst=0;
            AvgRandom=0;
                
            }else if(op == 5){
                
                //insertion sort analysis
            
            for(int i=0;i<10;i++){
                
                //System.out.println("-------<<<<<<<<< Round "+(i+1)+" >>>>>>>>>-------");
                
                t1 = System.nanoTime();
                ly.InsertionSort(b);
                t2 = System.nanoTime();
                //System.out.print("Time taken by insertion sort in worst case --> ");
                tWorst[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                t1 = System.nanoTime();
                ly.InsertionSort(c);
                t2 = System.nanoTime();
                //System.out.print("Time taken by insertion sort in avg case --> ");
                tAvg[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
                
                
                t1 = System.nanoTime();
                ly.InsertionSort(b);
                t2 = System.nanoTime();
                //System.out.print("Time taken by insertion sort in best case --> ");
                tBest[i] = ((double)(t2-t1)/(double)1000);
                //System.out.println("  "+(t2-t1)+"  nano seconds or "+((double)(t2-t1)/(double)1000)+" micro second\n");
                t1=0;t2=0;
                
            }
            for(int i=0;i<10;i++){
                AvgBest = AvgBest + tBest[i];
                AvgRand = AvgRand + tAvg[i];
                AvgWorst = AvgWorst + tWorst[i];
                //AvgRandom = AvgRandom + tRandom[i];
            }
            
            //System.out.println("\n\nAverage Time taken by insertion sort in Random case --> ");
            //System.out.println("  "+AvgRandom/20+"  micro second");
            
            System.out.println("\n\nAverage Time taken by insertion sort in best case --> ");
            System.out.println("  "+(AvgBest/10)+"  micro second");
            
            System.out.println("Average Time taken by insertion sort in average case --> ");
            System.out.println("  "+AvgRand/10+"  micro second");
            
            System.out.println("Average Time taken by insertion sort in worst case --> ");
            System.out.println("  "+AvgWorst/10+"  micro second");
            
            AvgBest =0;
            AvgRand =0;
            AvgWorst=0;
            AvgRandom=0;
                
            }else{
                break ;
            }
                
            }
        
        
    }
    
    
} 
