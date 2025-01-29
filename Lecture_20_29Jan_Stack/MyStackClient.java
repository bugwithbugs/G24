package Lecture_20_29Jan_Stack;

public class MyStackClient {
    public static void main(String[] args) {
        try {
            MyStack ms = new MyStack();
            ms.push(10);
            ms.push(20);
            ms.push(30);
            ms.push(40);

            ms.display();

            System.out.println("Top element in stack: " + ms.peek());

            System.out.println("Current size of stack: " + ms.size());

            System.out.println("Deleting top element: " + ms.pop());

            System.out.println("Is stack empty? " + ms.isEmpty());
            
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();

            System.out.println("Is stack empty? " + ms.isEmpty());
            
            System.out.println("Current size of stack: " + ms.size());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
