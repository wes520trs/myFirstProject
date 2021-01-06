package com.seleniummaster.datastructure;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //LinkedList class implements the queue interface
        Queue<Integer> customers=new LinkedList<>();
        customers.add(1);
        customers.add(2);
        customers.add(3);
        customers.add(4);
        System.out.println(customers.toString());
        customers.remove(); //remove first-in, remove 1
        System.out.println(customers.toString());
        System.out.println(customers.peek()); //check the customer exist or not
        System.out.println(customers.add(5)); // add is boolean type
        System.out.println(customers.add(3));
        System.out.println(customers.toString());
//        customers.remove();
//        customers.remove();
//        customers.remove();
//        customers.remove();
//        customers.remove();
//        customers.remove();
        System.out.println(customers.toString());
        System.out.println(customers.peek());
        customers.poll();
        customers.remove(4);
        System.out.println(customers.toString());

        System.out.println("priority queue");
        Queue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.add("Banana");
        priorityQueue.add("Apple");
        priorityQueue.add("Pear");
        priorityQueue.add("Grape");
        System.out.println(priorityQueue.toString());
        // alphabatic order 

    }
}
