package Queue;

public class Test {
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(1);
        queue.size();
        queue.show();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.size();
    }
}
