package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltFunc {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
//Queue is an interface.
//LinkedList is used in Queue because it provides efficient
// insertion at the rear and deletion from the
// front in O(1) time, making it suitable for FIFO operations.