package Stack;

public class Test {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.push(5);

        stack.show();

        System.out.println(stack.pop());

        stack.show();

        System.out.println(stack.peek());

        stack.show();
    }
}
