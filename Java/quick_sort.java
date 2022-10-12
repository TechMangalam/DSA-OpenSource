public class QuickSort {
 
    static int[] ar = { 2, 1, 9, 5, 3, 8, 4 };
    public static void main(String[] args) {
           
           System.out.print("Display array before Quick sorting: "  );
           for (int i = 0; i < ar.length; i++)
                  System.out.print(ar[i] +" ");
           
           quickSort(0, ar.length - 1);
           
           System.out.print("\nDisplay array after Quick sorting: "  );
           for (int i = 0; i < ar.length; i++)
                  System.out.print(ar[i] +" ");
            
    }
    
    
    /*
     * method performs quick sort in java.
     */
    public static void quickSort(int left, int right) {
           if (right - left <= 0) // size <= 1,
                  return; // means array is already sorted.
           else{
                  int pivot = ar[right]; // rightmost item
                  int partition = partitionArray(pivot, left, right); //find out partition range.
                  quickSort(left, partition - 1);   // sort the left side.
                  quickSort(partition + 1, right); // sort the right side.
           }
    }
    
    //partition of array in java
    public static  int partitionArray(int pivot, int left, int right) {
           int leftIndicator = left - 1;
           int rightIndicator = right;
           while (true) {
                  // find bigger element.
                  while(ar[++leftIndicator] < pivot);          //execute while loop till -> elements are smaller than pivot, as soon as bigger element is found we stop while loop.
           
                  // find smaller element.
                  while(rightIndicator>0 && ar[--rightIndicator]>pivot);//execute while loop till -> elements are greater than pivot, as soon as smaller element is found we stop while loop.
                        
                  if (leftIndicator >= rightIndicator) // if pointers have crossed, partition have been done, break.
                        break;
                  else
                        swapElements(leftIndicator, rightIndicator); //If we haven't crossed swap the elements.
           }
           
           swapElements(leftIndicator, right); // restoring the pivot.
           return leftIndicator; //return restored pivot location.
    }
    
    public static void swapElements(int pos1, int pos2){
           int temp = ar[pos1];
           ar[pos1] = ar[pos2];
           ar[pos2] = temp;
    }
    
}
