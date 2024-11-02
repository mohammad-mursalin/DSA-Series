package Stack;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        top--;
        int data = stack[top];
        return data;
    }

    public void show() {
        for(int i = 0 ; i < 5 ; i++) {
            System.out.print(stack[i] +" ");
        }
        System.out.println();
    }
}
