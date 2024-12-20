package Stack;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if(top == 5) {
            System.out.println("stack limit over");
        }
        else {
            stack[top] = data;
            top++;
        }
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
        for(int i = 0 ; i < 5 ; i++) {
            System.out.print(stack[i] +" ");
        }
        System.out.println();
    }
}
