package day49_Collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("priorityQueue = " + priorityQueue);//[10, 40, 300, 200, 90]

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("arrayDeque = " + arrayDeque);//[10, 200, 300, 40, 90] order

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("linkedList = " + linkedList);//[10, 200, 300, 40, 90] order

        System.out.println("-------------------------------------------------");

        //First in, first out

        priorityQueue.poll();//FIFO
        System.out.println("priorityQueue = " + priorityQueue);//[40, 90, 300, 200]

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);//[90, 200, 300]

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);//[200, 300, 40, 90]

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);//[200, 300, 40, 90]

        System.out.println("-------------------------------------------------");

        //System.out.println(priorityQueue.get(1));
        //System.out.println(arrayDeque.get(1));
        //System.out.println(((List) linkedList).get(1)); //downcasting
        System.out.println(((LinkedList<Integer>) linkedList).get(1));




    }
}
