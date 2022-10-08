import java.util.*;

class BinarySearch{

  public void binarySearch(int[] arr,int low,int high,int k){
    if(low<high){
      int mid = low + (high-low)/2;
      if(arr[mid] == k){
        System.out.println("Element found");
        return;
      }else if(arr[mid]>k){
        binarySearch(arr,low,mid-1,k);
      }else{
        binarySearch(arr,mid+1,high,k);
      }
    }else{
      System.out.println("Element not found");
      return;
    }
  }

}
