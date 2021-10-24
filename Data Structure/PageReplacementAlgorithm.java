//Mangalam Pandey 201951089
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


class PageReplacementAlgo
{
    // Method to find page faults using FIFO
    static int pageFaultsFIFO(int pages[], int n, int capacity)
    {
        HashSet<Integer> s = new HashSet<>(capacity);
    
        // To store the pages in FIFO manner
        Queue<Integer> indexes = new LinkedList<>() ;
        boolean pf = false;
        System.out.println("For FIFO -->\n");
        int page_faults = 0;
        for (int i=0; i<n; i++)
        {
            pf = false;
            System.out.print(pages[i]+" --> "+indexes+" ");
            // Check if the set can hold more pages
            if (s.size() < capacity)
            {
                // Insert it into set if not present
                // already which represents page fault
                if (!s.contains(pages[i]))
                {
                    s.add(pages[i]);
                    page_faults++;
                    pf = true;
                    indexes.add(pages[i]);
                }
            }else
            {
                // Check if current page is not already
                // present in the set
                if (!s.contains(pages[i]))
                {
                    int val = indexes.peek();
                    indexes.poll();
                    s.remove(val);
                    s.add(pages[i]);
                    indexes.add(pages[i]);
                    page_faults++;
                    pf = true;
                }
            }
            if(pf){
                System.out.print("  page fault\n");
            }else{
                System.out.print("  no page fault\n");
            }
        }
        
            
        return page_faults;
    }
    
    // Method to find page faults LRU
    static int pageFaultsLRU(int pages[], int n, int capacity)
    {
        HashSet<Integer> s = new HashSet<>(capacity);
    
        // To store least recently used indexes
        // of pages.
        HashMap<Integer, Integer> indexes = new HashMap<>();
        boolean pf = false;
        int page_faults = 0;
        System.out.println("\nFor LRU -->");
        for (int i=0; i<n; i++)
        {
            pf = false;
            System.out.print(pages[i]+" --> "+indexes+" ");
            if (s.size() < capacity)
            {
                // Insert it into set if not present
                // already which represents page fault
                if (!s.contains(pages[i]))
                {
                    s.add(pages[i]);
                    pf = true;
                    page_faults++;
                }
                indexes.put(pages[i], i);
            }else
            {
                // Check if current page is not already
                // present in the set
                if (!s.contains(pages[i]))
                {
                    int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;
                    
                    Iterator<Integer> itr = s.iterator();
                    
                    while (itr.hasNext()) {
                        int temp = itr.next();
                        if (indexes.get(temp) < lru)
                        {
                            lru = indexes.get(temp);
                            val = temp;
                        }
                    }
                    s.remove(val);
                    
                    indexes.remove(val);
                    s.add(pages[i]);
                    pf = true;
                    page_faults++;
                }
    
                // Update the current page index
                indexes.put(pages[i], i);
            }
           
            if(pf){
                System.out.print("  page fault\n");
            }else{
                System.out.print("  no page fault\n");
            }
        }
    
        return page_faults;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter page reference string -->");
        String prs = sc.next();
        char pc[] = prs.toCharArray();
        int pages[] = new int[pc.length];
        int capacity;
        
        for(int i=0;i<pc.length;i++){
            pages[i] = Integer.parseInt(""+pc[i]);
        }
        
        System.out.println("Enter no of page frames -->");
        capacity = sc.nextInt();

        
        System.out.println("No of page faults in FIFO --> "+pageFaultsFIFO(pages, pages.length, capacity));
        System.out.println("No of page faults in LRU --> "+pageFaultsLRU(pages, pages.length, capacity));
    }
}

