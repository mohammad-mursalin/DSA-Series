package Stack;

public class DStackTest {

    public static void main(String[] args) {

        DynamicStack dStack = new DynamicStack();

        dStack.push(1);
        dStack.push(1);
        dStack.push(1);
        dStack.push(1);
        dStack.push(1);

        dStack.show();

        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.pop();

        dStack.show();
    }
}
