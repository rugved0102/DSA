import java.util.Stack;

public class _04_AmortizedQueueUsingStack {
    

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x); // Always push to s1
    }

    public int pop() {
        if (empty()) throw new RuntimeException("Queue is empty");
        shiftStacks();
        return s2.pop();
    }

    public int peek() {
        if (empty()) throw new RuntimeException("Queue is empty");
        shiftStacks();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // Move elements from s1 to s2 only if s2 is empty
    private void shiftStacks() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}


