package Queues;


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addLast(2);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
//can't contain null elements
//it is not thread safe.
//can insert and remove elements from both sides.