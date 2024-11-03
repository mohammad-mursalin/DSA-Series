package Queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("The queue is full");
        }
        else {
            queue[rear] = data;
            rear = (rear+1) % 5;
            size++;
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println(queue[front]);
            front = (front + 1) % 5;
            size--;
        }
    }

    public void size() {
        System.out.println("Size of the queue : " + (size));
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return size == 5;
    }

    public void show() {
        System.out.print("Elements in the queue : ");
        for(int i = 0 ; i < size ; i++) {
            System.out.print(queue[(i+front)%5] + " ");
        }
        System.out.println();
    }
}
