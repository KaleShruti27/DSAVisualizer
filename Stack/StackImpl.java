package Stack;

import java.util.Arrays;

public class StackImpl {
    private int[] stack;
    private int top;
    private int capacity;

    public StackImpl(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        printStack("Pushed " + value);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return;
        }
        int popped = stack[top--];
        printStack("Popped " + popped);
    }

    private void printStack(String action) {
        System.out.println(action);
        System.out.print("Current Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("\n");
    }
}
