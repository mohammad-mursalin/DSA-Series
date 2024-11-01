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
        Node node = head;

        while(node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);
        System.out.println();
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node node = head;

        if(index == 0)
            insertAtFirst(data);
        else {
            for(int i = 0 ; i < index - 1 ; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeAt(int index) {
        Node node = head;

        if(index == 0)
            removeFirst();
        else {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node n = node.next;
            node.next = n.next;
            n.next = null;
        }
    }
}
