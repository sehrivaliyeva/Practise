package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue1 {
    public static void main(String[] args) {

        //INDEX MESELESI ANCAQ LISTDE OLUR
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        priority.add(1);
        priority.offer(2);

        //add() and offer()--------------O(log(n)) olur min-heap olduguna gore
        // remove() poll() elementi ------------O(log(n)) olur
        //element() peek()-----------O(1) olur
        //contains()--------------O(n) olur


    }
}
