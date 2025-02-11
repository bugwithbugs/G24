package Lecture25_Feb11_StackUsingLinkedList;

public class MyStackClient {
    public static void main(String[] args) {
        try {
            StackUsingLinkedList st = new StackUsingLinkedList();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Top: " + st.peek());
        System.out.println("Is stack empty? " + st.isEmpty());
        System.out.println("Size of stack: " + st.size());
        System.out.println("Deleting top element: " + st.pop());

        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.out.println("Is stack empty? " + st.isEmpty());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
