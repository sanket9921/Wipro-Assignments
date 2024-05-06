public class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        try {
            if (top == capacity - 1) {
                throw new IllegalStateException("Stack is full. Cannot push.");
            } else {
                stack[++top] = item;
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public int pop() {
        try {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty. Cannot pop.");
            } else {
                return stack[top--];
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return -1; // Return a sentinel value indicating an empty stack
        }
    }

    public int peek() {
        try {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty. Cannot peek.");
            } else {
                return stack[top];
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return -1; // Return a sentinel value indicating an empty stack
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        
        // Pushing integers onto the stack
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        // Popping and displaying until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
