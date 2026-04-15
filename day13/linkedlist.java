class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class linked{
    Node head;
    public void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data)
    {
        Node newNode= new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int position,int data)
    {
        if(position==0)
        {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(15);
        Node temp=head;
        for(int i=0;i<position;i++)
        {
            if(temp.next==null)return;
            temp=temp.next;
        }
        if(temp.next!=null)
        {
            temp.next=temp.next.next;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->");
    }
    public void deleteAtstart()
    {
        head=head.next;
    }
    public void deleteAtEnd()
    {
        Node temp=head;
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
}
public class linkedlist {
     public static void main(String[] argv)
     {
        linked list = new linked();
        list.insertAtStart(5);
        list.insertAtEnd(10);
        list.deleteAtstart();
        list.deleteAtEnd();
        list.display();
     }
}
