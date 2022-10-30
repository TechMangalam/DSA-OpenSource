import java.util.*;
public class sort {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int size;
        System.out.print("Enter Size:");
        size = sn.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element:");
            a[i] = sn.nextInt();
        }
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                System.out.print("After Swap:");
                for (int i = 0; i < size; i++) {
                    
                    System.out.print(a[i]);
                }
                System.out.println();
    }
}