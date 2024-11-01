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

    public void addAt(int i, int v) {
        Node newNode = new Node();
        Node nextNode;
        newNode.data = v;

        int count = 0;
        Node node = head;

        while (node.next != null) {
            node = node.next;
            count++;
            nextNode = node.next;

            if(count == i-1){
                node.next = newNode;
                newNode.next = nextNode;
            }
        }
    }
}
