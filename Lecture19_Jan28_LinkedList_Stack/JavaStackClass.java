package Lecture19_Jan28_LinkedList_Stack;

import java.util.Stack;

public class JavaStackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Current size of stack: " + st.size());

        System.out.println("popping: " + st.pop());

        System.out.println("Looking at top without deleting: " + st.peek());

        System.out.println("Current size of stack: " + st.size());

    }
}
