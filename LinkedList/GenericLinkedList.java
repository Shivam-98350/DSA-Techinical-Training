class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class GenericLinkedList {

    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = new Node<Integer>(4);
        n3.next.next = new Node<Integer>(5);

        Node<String> s = new Node<>("Shivam");
        System.out.println(s.data);

        Node<Integer> start = n1;

        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }

    }

}
