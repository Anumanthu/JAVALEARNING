package src.practiceproblems;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Queue<String> pq = new PriorityQueue<>();
        Queue<String> q = new LinkedList<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        pq.add("Java");
        pq.add("Selenium");


        System.out.println("Initial Queue " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove Geeks " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);

        System.out.println("peek Queue " + pq.peek());

        System.out.println("Final Queue " + pq);

    }

}
