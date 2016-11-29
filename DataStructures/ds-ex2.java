import java.util.PriorityQueue;

// Exercise 2
// Create a PriorityQueue that can handle
// integers in an ascending order.
// The maximum capacity of the queue should be 50.

public class ds-ex2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(11); // using constructor that declares size

        // add integer values in queue
        queue.add(1);
        queue.add(10);
        queue.add(7);
        queue.add(6);
        queue.add(9);

        while (queue.size() != 0) // while queue size is bigger than zero
        {
            System.out.println(queue.remove()); // prints and removes the head of the queue
        }
    }
}
