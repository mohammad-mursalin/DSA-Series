package Tree;

public class BinaryTree {

    Node rootNode = new Node();

    public void insert(int data) {
        insertItem(rootNode, data);
    }

    private void insertItem(Node rootNode, int data) {
        if(rootNode.data == -1) {
            rootNode.data = data;
        }
        else {
            if(rootNode.data > data) {
                if(rootNode.leftNode == null) {
                    rootNode.leftNode = new Node();
                    rootNode.leftNode.data = data;
                }
                else {
                    insertItem(rootNode.leftNode, data);
                }
            }
            else if(rootNode.data < data) {
                if(rootNode.rightNode == null) {
                    rootNode.rightNode = new Node();
                    rootNode.rightNode.data = data;
                }
                else {
                    insertItem(rootNode.rightNode, data);
                }
            }
        }
    }
}
