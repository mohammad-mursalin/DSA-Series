package LinkedList;

public class Test {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(3);
        list.add(6);
        list.add(1);
        list.add(8);

        list.show();

        list.addAt(2, 5);

        list.show();
    }
}
