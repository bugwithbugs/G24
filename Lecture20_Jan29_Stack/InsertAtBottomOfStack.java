package Lecture20_Jan29_Stack;

import java.util.Stack;

public class InsertAtBottomOfStack {

    public static void InsertAtBottom (Stack<Integer> st, int item){

        if(st.isEmpty()){
            st.push(item);
            return;
        }

        int top = st.pop();
        InsertAtBottom(st, item);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        int itemToPush = 60;

        InsertAtBottom(st, itemToPush);

        System.out.println(st);
    }
}
