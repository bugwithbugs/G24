package Lecture28_QueueUsingArrayAndLinkedList;

public class ArrayQueue {
    private int size;
    private int capacity;
    private int front;
    private int rear;

    private int[] arr;

    ArrayQueue() {
        capacity = 5;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    ArrayQueue(int length) {
        capacity = length;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }

        arr[rear] = item;
        rear = (rear + 1) % capacity;

        size++;
    }

    int dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int first = arr[front];
        front = (front + 1) % capacity;

        size--;

        return first;
    }

    int peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return arr[front];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void display() {

        if(isEmpty()){
            System.out.println("No elements in the Queue.");
            return;
        }

        if (front > rear) {
            for (int i = front; i < capacity; i++)
                System.out.print(arr[i] + " ");
            for (int i = 0; i < rear; i++)
                System.out.print(arr[i] + " ");
        } else {
            for (int i = front; i < rear; i++)
                System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
