// package Stacks.Questions;

import java.util.*;

class Implement_Queue_using_Stack  {
    public static void main(String[] args) {
        Implement_Queue_using_Stack queue = new Implement_Queue_using_Stack();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Peek: " + queue.peek()); // 10
        System.out.println("Pop: " + queue.pop());   // 10
        System.out.println("Pop: " + queue.pop());   // 20
        System.out.println("Empty? " + queue.empty()); // false
        System.out.println("Pop: " + queue.pop());   // 30
        System.out.println("Empty? " + queue.empty()); // true
    }
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Implement_Queue_using_Stack () {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }

        }
        return second.peek();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */