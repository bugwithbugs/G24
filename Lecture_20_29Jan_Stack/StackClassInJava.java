package Lecture_20_29Jan_Stack;

import java.util.Stack;

public class StackClassInJava {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);

        System.out.println("Top element in stack: " + st.peek());

        System.out.println("Current size of stack: " + st.size());

        System.out.println("Deleting top element: " + st.pop());

        System.out.println("Is stack empty? " + st.isEmpty());
        
        st.pop();
        st.pop();
        st.pop();

        System.out.println("Is stack empty? " + st.isEmpty());
        
        System.out.println("Current size of stack: " + st.size());

    }
}
