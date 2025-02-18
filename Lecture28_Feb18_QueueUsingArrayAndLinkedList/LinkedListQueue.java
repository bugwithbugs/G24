package Lecture28_Feb18_QueueUsingArrayAndLinkedList;

public class LinkedListQueue {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    LinkedListQueue() {
        front = null;
        rear = null;

        size = 0;
    }

    void enqueue(int item) {

        Node newNode = new Node(item);

        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {

        if (isEmpty())
            throw new IllegalStateException("Queue is empty.");

        int first = front.data;

        front = front.next;

        if (front == null)
            rear = null;

        return first;
    }

    int peek() {

        if (isEmpty())
            throw new IllegalStateException("Queue is empty.");

        return front.data;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void display () {
        Node curr = front;

        while (curr!=null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

}
