import java.util.*;
//start
public class BSTAnalysis
{
    public  class bnode
    {
        int data;
        bnode left,right;
        public bnode()
        {
            left = null;
            right = null;
        }
        public bnode(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    
    static bnode head;
    
    public bnode createNode(int data)
    {
       bnode nnode = new bnode(data); 
       return nnode;
    }
    
    public bnode insert(bnode root,int d)
    {
        if(root==null)
        {
            return (createNode(d));
        }
        else
        {
            if(root.data>d)
            root.left = insert(root.left,d);
            else
            root.right = insert(root.right,d);
        }
        return root;
    }
    
    public static  bnode delete(bnode node,int d)
    {
        if(node==null)
        {
            
            return node;
        }
        else if(d<node.data)
        {
            node.left = delete(node.left,d);
        }
        else if(d>node.data)
        {
            node.right = delete(node.right,d);
        }
        else if(node.left==null && node.right==null)
        {
            return null;
        }
        else if(node.left!=null && node.right!=null)
        {
            node.data = findLargestNode(node.left).data;
            node.left = delete(node.left,node.data);
        }
        else
        {
            if(node.left==null)
            {
                return delete(node.right,d);
            }
            else
            {
                return delete(node.left,d);
            }
        }
        return node;
    }
    
    public static bnode findLargestNode(bnode node)
    {
        if(node==null || node.right==null)
        return node;
        else
        {
            return findLargestNode(node.right);
        }
    }
    
    
    
    public void displayIn(bnode root)
    {
        
        if(root!=null)
        {
            
            displayIn(root.left);
            System.out.print("  "+root.data);
            displayIn(root.right);
            
        }
        
    }
    
    static bnode deleteNode(bnode head,int a[]){
        for(int i = 0;i<a.length;i++){
                 head = delete(head,a[i]);
             }
             return head;
    }
    
    static bnode headA,headB,headC;
    
    public static void main(String[] args)
    {
        Scanner sn =new Scanner(System.in);
        BSTAnalysis bst1 = new BSTAnalysis();
        
      
        long t1=0,t2=0,op=1;
        double tBest;
        double tAvg;
        double tWorst;
        
        
        for(int count = 2000;count<=10000;count+=2000){
            
            System.out.println("\n\n Execution for "+count+" element array");
            
            int a[] = new int[count];
            int b[] = new int[count];
            int c[] = new int[count];
            
            //elements in random order
             for(int i = 0;i<a.length;i++){
                  a[i] = (int)(Math.random()*(i+5)*3-5) + i;
             }
                //elements in random order is copied to c
             for(int i = 0;i<c.length;i++){
                    c[i] = a[a.length-1-i];
             }
                //element in a are arranged in ascending order
             Arrays.sort(a);
                //copying elements in a to b in descending order
             for(int i = 0;i<a.length;i++){
                    b[i] = a[a.length-1-i];
             }
             
            //execution time for insertion in bst
             t1 = System.nanoTime();
             for(int i = 0;i<a.length;i++){
                  headA = bst1.insert(headA,a[i]);
             }
             t2 = System.nanoTime();
                    
             tBest = ((double)(t2-t1)/(double)1000);
             t1=0;t2=0;
                    
             t1 = System.nanoTime();
             for(int i = 0;i<a.length;i++){
                  headB = bst1.insert(headB,b[i]);
             }
             t2 = System.nanoTime();
                    
             tAvg = ((double)(t2-t1)/(double)1000);
             t1=0;t2=0;
                    
             t1 = System.nanoTime();
             for(int i = 0;i<a.length;i++){
                 headC = bst1.insert(headC,c[i]);
             }
             t2 = System.nanoTime();
                    
             tWorst = ((double)(t2-t1)/(double)1000);
             t1=0;t2=0;       
                
               
             System.out.println("\n\nAverage Time taken by insertion in BST for A[ ]  --> ");
             System.out.println("  "+tBest+"  micro second");
                    
             System.out.println("Average Time taken by insertion in BST for B[ ]  --> ");
             System.out.println("  "+tAvg+"  micro second");
                    
             System.out.println("Average Time taken by insertion in BST for C[ ]  --> ");
             System.out.println("  "+tWorst+"  micro second");
                    
               
                
                /* -----deletion in bst----- */
                
             
             t1 = System.nanoTime();
             headA = deleteNode(headA,a);
             t2 = System.nanoTime();
             tBest = ((double)(t2-t1)/(double)1000);
             t1=0;t2=0; 
             
             t1 = System.nanoTime();
             headB = deleteNode(headB,b);
             t2 = System.nanoTime();
             tAvg = ((double)(t2-t1)/(double)1000);
             t1=0;t2=0; 
             
             t1 = System.nanoTime();
             headC = deleteNode(headC,b);
             t2 = System.nanoTime();
             tWorst = ((double)(t2-t1)/(double)1000);
             t1=0;t2=0; 
             
            
             
             System.out.println("\n\nAverage Time taken by deletion in bst for A[ ]  --> ");
             System.out.println("  "+tBest+"  micro second");
                
             System.out.println("Average Time taken by deletion in bst for B[ ]  --> ");
             System.out.println("  "+tAvg+"  micro second");
                
             System.out.println("Average Time taken by deletion in bst for C[ ]  --> ");
             System.out.println("  "+tWorst+"  micro second");
        }
        
           
    }
}





