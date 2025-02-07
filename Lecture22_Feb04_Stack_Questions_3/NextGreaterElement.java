package Lecture22_Feb04_Stack_Questions_3;

import java.util.Stack;

public class NextGreaterElement {

    static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;

        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty())
                nge[i] = -1;
            else
                nge[i] = st.peek(); // peek() > arr[i]

            st.push(arr[i]);
        }

        return nge;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 9, 7, 13 };

        int[] nge = nextGreaterElement(arr);

        for (int val : nge) {
            System.out.print(val + " ");
        }

    }
}