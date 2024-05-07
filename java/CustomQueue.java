import java.util.NoSuchElementException;

public class CustomQueue {
    private Object[] queue;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            Object item = queue[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue(6); // Set capacity to 6

        customQueue.enqueue("apple");
        customQueue.enqueue("banana");
        customQueue.enqueue("cherry");
        customQueue.enqueue(1);
        customQueue.enqueue(2);
        customQueue.enqueue(3);

        while (!customQueue.isEmpty()) {
            System.out.println("Dequeued item: " + customQueue.dequeue());
        }

        try {
            System.out.println("Attempting to dequeue from an empty queue:");
            customQueue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
