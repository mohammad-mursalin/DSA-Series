package Tree;

public class BinaryTree {

    Node rootNode;

    public void insert(int data) {
        rootNode = insertItem(rootNode, data);
    }

    private Node insertItem(Node root, int data) {
        if(root == null)
            root = new Node(data);

        else if(root.data > data)
            root.leftNode = insertItem(root.leftNode, data);

        else if(root.data < data)
            root.rightNode = insertItem(root.rightNode, data);

        return root;
    }

    public void inOrder() {
        inOrderRec(rootNode);
    }

    public void inOrderRec(Node root) {
        if(root != null) {
            inOrderRec(root.leftNode);
            System.out.print(root.data + " ");
            inOrderRec(root.rightNode);
        }
    }
}
