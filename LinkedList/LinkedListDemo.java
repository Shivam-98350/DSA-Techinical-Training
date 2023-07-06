class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = new Node(4);
        n3.next.next = new Node(5);

        Node start = n1;

        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }
    }

}
