package com.DSAtopics;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Set;
import java.util.Map;
import java.util.ListIterator;

public class CollectionFramework {
    public static void main(String[] args) {

//        ArrayList<Integer> c = new ArrayList<>();
//        c.add(10);
//        c.add(20);
//        c.add(30);
//        c.add(40);
//        System.out.println(c);
//        c.remove(0);
//        System.out.println(c);
//        int d=c.get(2);
//        System.out.println(d);
//        c.set(2,100);
//        System.out.println(c);


        // com.DSAtopics.Stack

//        com.DSAtopics.Stack<Integer> c = new com.DSAtopics.Stack<Integer>();
//        c.push(10);
//        c.push(20);
//        c.push(30);
//        c.push(40);
//        System.out.println(c);
//        c.pop();
//        System.out.println(c);
//        if(c.isEmpty()){
//            System.out.println("empty");
//        }
//        System.out.println("filled");


                         // Linked List

         //com.DSAtopics.LinkedList<Integer> c = new com.DSAtopics.LinkedList<>();         // commands are little bit same as that of Array List

                         // queue using linked list

//        com.DSAtopics.Queue<Integer> c = new com.DSAtopics.LinkedList<>();
//        c.offer(10);
//        c.offer(20);
//        c.offer(30);
//        c.offer(40);
//        System.out.println(c);
//        c.poll();
//        c.poll();
//        System.out.println(c);
//        int s = c.peek();
//        System.out.println(s);

                          // Priority queue          -- // priority queue uses Min Heap
                                                        // while if we Comparat oe.reverseOrder() then it gives Max Heap

//        com.DSAtopics.Queue<Integer> c = new PriorityQueue<>(Comparator.reverseOrder());
//        c.offer(30);
//        c.offer(40);
//        c.offer(89);
//        c.offer(200);
//        c.offer(300);
//        c.poll();
//        System.out.println(c);

                                 // Set

//        Set<Integer> c = new HashSet<>();
//        c.add(20);
//        c.add(30);
//        c.add(40);
//        c.add(50);
//        c.remove(50);
//        System.out.println(c);


//        Set<Integer> c = new LinkedHashSet<>();      // LL+set
//        c.add(20);
//        c.add(30);
//        c.add(40);
//        c.add(50);
//        c.add(20);
//        c.remove(50);
//        System.out.println(c);


//        Set<Integer> c = new TreeSet<>();      // Set + BST (Binary search tree)
//        c.add(20);
//        c.add(30);
//        c.add(40);
//        c.add(50);
//        c.add(20);
//        c.remove(50);
//        System.out.println(c);

                                   //MAP

//        Map<Integer,String> c = new HashMap<>();
//        c.put(4,"sojwal");
//        c.put(2,"tejya");
//        c.put(3,"pajya");
//        c.putIfAbsent(1,"pashya");
//        System.out.println(c);
//        for (Integer d : c.keySet()){
//            System.out.println(d);
//        }
//        for (String d: c.values()){
//            System.out.println(d);
//        }

             //  Map<Integer,String> c = new TreeMap<>();   same as of hash map but in serial order Map+BST

             // Iterator
             // Forward Traversing--> hasNext--> next
             // Reverse Traversing--> hasPrevious --> previous

        ArrayList<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        ListIterator<Integer> d = c.listIterator();
        while(d.hasNext()){
            System.out.print(d.next() + " ");
        }
        System.out.println();
        while (d.hasPrevious()){
            System.out.print(d.previous() + " ");
        }
    }
}
