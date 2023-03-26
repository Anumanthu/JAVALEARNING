package src.practiceproblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(500);
        pq.add(250);
        pq.add(700);
        pq.add(100);
        pq.add(150);
        pq.add(350);
        pq.add(450);
        pq.add(650);
        pq.add(50);

        //Difference between poll() and remove() is it will give null value in case of poll where as in remove it throws no such element exception

        System.out.println(pq.isEmpty());//false
        System.out.println(pq.remove());//50 will removed
        System.out.println(pq.poll());//100 will be come and head/front end will change to 150
        System.out.println(pq.poll());//150 will be come and head/front end will change to 250
        System.out.println(pq.peek());//250 will be come and head/front end will Not change/affect
        System.out.println(pq.peek());//250 will be come and head/front end will Not change/affect

        System.out.println(" priority queue results ****\n");
        new LinkedListExample().priotiyqueue();

    }
}

class Book implements Comparable<Book> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(Book b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class LinkedListExample {
    public void priotiyqueue() {
        Queue<Book> queue = new PriorityQueue<Book>();
        //Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for (Book b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for (Book b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}

