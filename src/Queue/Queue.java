package Queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enqueue(int data) {
        queue[rear] = data;
        rear++;
        size++;
    }

    public void show() {
        System.out.print("Elements in the queue : ");
        for(int i = front ; i < size ; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
