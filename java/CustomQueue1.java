
import java.util.NoSuchElementException;

public class CustomQueue1 {
    private int size;
    private Object[] queueArray;
    private int front;
    private int rear;


    public CustomQueue1() {

    }
    public CustomQueue1(int size) {
        super();
        this.size = size;
        this.queueArray = new Object[size];
        this.front = -1;
        this.rear = 0;
    }

    public void enqueue( Object value) {
        if(size == queueArray.length) {
            throw new IllegalStateException("Queue is full");

        }
        rear = (rear + 1)% queueArray.length;
        queueArray[rear]= value;
    }

    public Object dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }

        Object temp = queueArray[front];
        front = (front + 1) % queueArray.length;
        size--;

        if(size > 0 && size == queueArray.length /4) {
            resize(queueArray.length / 2);
        }
        return temp;
    }

    public Object peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");

        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void resize(int i) {

        Object[]newQueue = new Object[queueArray.length * 2];
        for(int i1 =0; i1< size; i1++) {
            newQueue[i1] = queueArray[(front + i1) % queueArray.length];
        }

        queueArray =newQueue;
        front = 0;
        rear = size -1;
    }

    public static void main(String args[]) {

        CustomQueue1 queue = new CustomQueue1(5);
        queue.enqueue("Sangita");
        queue.enqueue("2");
        queue.enqueue("Third");
        queue.enqueue("Kapil");
        queue.enqueue("10");
        queue.enqueue("Sharma");

        while(!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

    }


}
