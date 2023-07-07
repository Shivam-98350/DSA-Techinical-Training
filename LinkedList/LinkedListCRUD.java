class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListCRUD<T> {

    private Node<T> start;

    void insertAtBeg(Node<T> node) {
        if (start == null) {
            start = node;
            return;
        }

        node.next = start;
        start = node;

    }

    int getCount()
    {
        Node<T> temp=start;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }

        return count;
    }

    void insertAtEnd(Node<T> node) {
        if (start == null) {
            start = node;
            return;
        }

        Node<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

    }

    void insertAtMid(Node<T> node,int pos) {
       
        

        if(pos==0)
        {
            insertAtBeg(node);
            return;
        }

        if(pos>getCount())
        {
            throw new RuntimeException("Position is greater than list size");
        }

        if(pos>=1)
        {
            int i=1;
            Node<T> temp = start;
            while(i<pos)
            {
                temp=temp.next;
                i++;
            }
            node.next=temp.next;
            temp.next=node;

        }
       

    }

    void deleteAtBeg()
    {
        if(start==null)return;

        start=start.next;
    }

    void deleteAtEnd()
    {
        if(start==null)return;
        Node<T> temp=start;

        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    void deleteAtMid(int pos)
    {
        if(start==null)return;

        Node<T> temp=null;

        if(pos==0)
        {
            deleteAtBeg();
            return;
        }

        int i=1;
        temp=start;

        while(i<pos)
        {
            i++;
            temp=temp.next;
        }

        temp.next=temp.next.next;
    }

    void MidPoint()
    {
        Node<T> fast=start;
        Node<T> slow=start;

        while(fast!=null && fast.next != null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }

        System.out.println("Mid point Element is "+slow.data);
    }

    void findKthRightNode(int k)
    {
        Node<T> fast=start;
        Node<T> slow=start;

        while(k-->0)
        {
            fast=fast.next;
        }

        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }

        System.out.println("Kth Node From Right is "+slow.data);

    }

    void reverseLinkedList()
    {
        if(start==null || start.next==null)return;

        Node<T> current=start;
        Node<T> prev=null;
        
        while(current!=null)
        {
            Node<T> next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        start=prev;

    }

    void print() {
        Node<T> temp = start;
        while (temp != null) {
            System.out.print(" |" + temp.data + "|");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListCRUD<Integer> obj = new LinkedListCRUD<>();

        obj.insertAtBeg(new Node<Integer>(2));
        obj.insertAtBeg(new Node<Integer>(6));
        obj.insertAtBeg(new Node<Integer>(8));
        obj.insertAtBeg(new Node<Integer>(10));
        obj.insertAtBeg(new Node<Integer>(22));
        obj.insertAtBeg(new Node<Integer>(29));

        System.out.println("After Insertion At Begining ");
        obj.print();

        obj.insertAtEnd(new Node<Integer>(24));
        obj.insertAtEnd(new Node<Integer>(25));

        System.out.println("After Insertion At End ");
        obj.print();

        obj.insertAtMid(new Node<Integer>(11),0);
        obj.insertAtMid(new Node<Integer>(13),4);
        obj.insertAtMid(new Node<Integer>(17),5);
        
        System.out.println("After Insertion At Mid ");
        obj.print();

        obj.deleteAtBeg();
        System.out.println("After Deleting first element ");
        obj.print();

        obj.deleteAtEnd();
        System.out.println("After Deleting Last element ");
        obj.print();

        obj.deleteAtMid(2);
        System.out.println("After Deleting element at "+2);
        obj.print();

        obj.MidPoint();

        obj.findKthRightNode(3);

        obj.reverseLinkedList();
        System.out.println("After reversing the Linked List");
        obj.print();

    }

}
