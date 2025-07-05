import java.util.LinkedList;
import java.util.Queue;

public class _01_StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // push costly
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // pop costly
    // public int pop() {
    //     if(q1.isEmpty()) {
    //         throw new RuntimeException("Stack is empty");
    //     }
    //     while(q1.size() > 1) {
    //         q2.add(q1.remove());
    //     }

    //     int popped = q1.remove();

    //     Queue<Integer> temp = q1;
    //     q1 = q2;
    //     q2 = temp;

    //     return popped;

    // }

    public int pop() {
        if(q1.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return q1.remove();
    }

    public int peek() {
        if(q1.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public int size() {
        return q1.size();
    }

    public static void main(String[] args) {
        _01_StackUsingQueue stack = new _01_StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
