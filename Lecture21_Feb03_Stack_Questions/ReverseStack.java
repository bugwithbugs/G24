package Lecture21_Feb03_Stack_Questions;

import java.util.Stack;

public class ReverseStack {

    //Time: O(n)
    //Space: O(1)
    public static void insertAtBottom (Stack<Integer> st, int item){

        if(st.isEmpty()){
            st.push(item);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, item);
        st.push(top);
    }

    
    //Time: O(n)
    //Space: O(n)
    static Stack<Integer> reverseUsingAnotherStack (Stack<Integer> st){

        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        return temp;
    }

    //Time: O(n^2)
    //Space: O(1)
    static void reverseUsingRecursion(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top = st.pop();
        reverseUsingRecursion(st);
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> reversedStack;
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        reversedStack = reverseUsingAnotherStack(st);

        System.out.println("Reversed using Another stack: " + reversedStack);

        reverseUsingRecursion(st);

        System.out.println("Reversed using recursion: " + reversedStack);

    }
}
