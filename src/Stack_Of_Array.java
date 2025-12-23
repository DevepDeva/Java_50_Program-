//Program to Implement a stack using a array
public class Stack_Of_Array {
    int top;
    int capacity;
    int[] stack;

    Stack_Of_Array() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Is Full");
        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Is Empty");
        }
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public static void main(String[] args) {
        Stack_Of_Array prg = new Stack_Of_Array();
        System.out.println(prg.isEmpty());
        prg.push(10);
        prg.push(20);
        prg.push(30);
        prg.push(40);
        prg.push(50);
        System.out.println(prg.isEmpty());
        System.out.println(prg.isFull());
        System.out.println(prg.capacity);
        System.out.println(prg.peek());
        System.out.println(prg.pop());
        System.out.println(prg.peek());
    }


}

