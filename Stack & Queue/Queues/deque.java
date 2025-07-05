// package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addLast(2);
        System.out.println(deque.remove());
    }
}
