package LinkedList;

public class LinkedList {

    Node head;

    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        }
        else {
            Node n = head;

            while(n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public void show() {

        while(head.next != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(head.data);
    }
}
