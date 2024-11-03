package Queue;

public class Test {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);

        queue.show();
    }
}
