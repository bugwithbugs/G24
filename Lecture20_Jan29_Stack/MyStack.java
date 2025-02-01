package Lecture20_Jan29_Stack;

public class MyStack {
    
    private int[] arr;
    private int index = -1;

    MyStack(){
        arr = new int[20];
    }

    MyStack(int size){
        arr = new int[size];
    }

    public void push (int item) {

        if(isFull()){
            throw new IllegalStateException("Stack is already at its full capacity");
        }

        index ++;
        arr[index] = item;
    }

    public int peek () {

        if(isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }

        return arr[index];
    }

    public int pop () {

        if(isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }

        int top = peek();
        index --;
        return top;
    }

    public int size () {
        return index + 1;
    }

    public boolean isEmpty () {
        return index == -1;
    }

    public boolean isFull () {
        return index + 1 == arr.length;
    }

    public void display () {
        for(int i = index; i >= 0; i--)
        System.out.println(arr[i]);
    }

}
