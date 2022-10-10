import java.util.*;

class BubbleLinked
{
    class node
{
    int data;
    node next;
}
    node head;
    
    public void newNodeEntry(int d)
    {
        node newnode=new node();
            newnode.data=d;
        if(head!=null)
        {
            newnode.next=head;
            head=newnode;
        }
        else
        {
            newnode.next=null;
            head=newnode;
        }
    }
    
    public void sortBubbleLinked()
    {
        node temp=head,temp1=head;
        int t=0;
        
        while(temp!=null)
        {
            while(temp1.next!=null)
            {
                if(temp1.data>temp1.next.data)
                {
                    t=temp1.data;
                    temp1.data=temp1.next.data;
                    temp1.next.data=t;
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }
    }
    
    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(" "+temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int option,d;
        BubbleLinked b=new BubbleLinked();
        do
        {
            System.out.println("\nEnter option -->1.Enter element in linked list  2.Sorting 3. display 0.exit");
            option=sn.nextInt();
            
            
            switch(option)
            {
                case 1:
                System.out.println("Enter data -->");
                d=sn.nextInt();
                b.newNodeEntry(d);
                break;
                case 2:
                b.sortBubbleLinked();
                break;
                case 3:
                b.display();
                break;
                
            }
        }
        while(option != 0);
        
        
    }
}
