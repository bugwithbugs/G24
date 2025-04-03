package Lecture21_Feb03_Stack_Questions;

import java.util.Stack;

public class Leetcode_2375 {
    
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder str = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i ++) {
            st.push(i+1);
            if(pattern.charAt(i) == 'I') {
                while(!st.isEmpty()){
                    str.append(st.pop());
                }
            }
        }

        st.push(n + 1);
        while(!st.isEmpty()){
            str.append(st.pop());
        }

        return str.toString();
    }
}
