import java.util.LinkedList;
import java.util.Queue;

public class _02_StackUsingSingleQueue {
    Queue<Integer> q = new LinkedList<>();
    

    // push costly
    public void push(int x) {
        q.add(x);

        for(int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }

    }



    public int pop() {
        if(q.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return q.remove();
    }

    public int peek() {
        if(q.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public int size() {
        return q.size();
    }

    public static void main(String[] args) {
        _02_StackUsingSingleQueue stack = new _02_StackUsingSingleQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}

