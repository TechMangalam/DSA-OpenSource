import java.util.*;
public class merge_linkedlist { 
    node head = null; 
    static class node { 
        int v; 
        node next; 
        public node(int v) 
        { 
            this.v = v; 
        } 
    } 

    node sortedmerge(node a, node b) 
    { 
        node result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
        if (a.v <= b.v) { 
            result = a; 
            result.next = sortedmerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedmerge(a, b.next); 
        } 
        return result; 
    } 

    node mergeSort(node h) 
    {  
        if (h == null || h.next == null) { 
            return h; 
        } 
        node middle = getMiddle(h); 
        node nextofmiddle = middle.next; 
        middle.next = null; 
        node left = mergeSort(h); 
        node right = mergeSort(nextofmiddle); 
        node sortedlist = sortedmerge(left, right); 
        return sortedlist; 
    } 
    public static node getMiddle(node head) 
    { 
        if (head == null) 
            return head; 
        node slow = head, fast = head; 
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    } 

    void push(int new_data) 
    { 
        node new_node = new node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    
    void printList(node headref) 
    { 
        while (headref != null) { 
            System.out.print(headref.v + " "); 
            headref = headref.next; 
        } 
    } 

    public static void main(String[] args) 
    { 
        Scanner sn=new Scanner(System.in);
        merge_linkedlist list = new merge_linkedlist();
        int op;
    do
    {
        System.out.println("\nEnter option 1.insert element 2.sort list 3.print list 0.exit");
    op=sn.nextInt();
    switch(op)
    {
        case 1:
        System.out.println("Enter data-->");
        int data=sn.nextInt();
        list.push(data);
        break;
        case 2:
        list.head = list.mergeSort(list.head);
        System.out.println("\nLinked List after sorting"); 
        list.printList(list.head);
        break;
        case 3:
        System.out.println(" Linked List "); 
        list.printList(list.head);
        break;
    }
    }while(op!=0);
    } 
} 
