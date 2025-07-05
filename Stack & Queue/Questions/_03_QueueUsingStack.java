import java.util.Stack;

public class _03_QueueUsingStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public _03_QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (s1.empty()) {
            throw new RuntimeException("String is empty");
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int removed = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return removed;
    }

    public int peek() {
        if (s1.empty()) {
            throw new RuntimeException("String is empty");
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int peek = s2.peek();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());

        }

        return peek;

    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
