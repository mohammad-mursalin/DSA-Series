package Stack;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if(top == capacity-1) {
            int length = size();
            int[] newStack = new int[capacity*2];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
            capacity *= 2;
        }

        stack[top] = data;
        top++;

    }

    public int pop() {
        if(top <= 0) {
            System.out.println("No elements left in the stack");
            return -1;
        }
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        if(top == (capacity/2)-1) {
            int length = size();
            int[] newStack = new int[capacity/2];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
            capacity /=2;
        }
        return data;
    }

    public int peek() {
        int data = stack[top-1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void show() {
        for(int i = 0 ; i < capacity ; i++) {
            System.out.print(stack[i] +" ");
        }
        System.out.println();
    }
}
