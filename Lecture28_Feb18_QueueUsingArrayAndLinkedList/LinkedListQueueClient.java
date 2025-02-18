package Lecture28_Feb18_QueueUsingArrayAndLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Size of Queue: " + q.size());

        try {
            q.enqueue(60);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Deleting Front: " + q.dequeue());
        System.out.println("Front of Queue: " + q.peek());

        q.dequeue();
        q.dequeue();

        System.out.println("Deleted 2 more elements.");
        System.out.println("Is queue empty? " + q.isEmpty());


    }
}
