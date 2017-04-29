package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		PriorityQueue<String> al = new PriorityQueue<String>();
        // For adding elements in PriorityQueue, we use add() function
        al.add("New York");
        al.add("California");
        al.add("London");
        al.add("New Delhi");
        al.add("Sydney");
        al.add("Tokyo");
        System.out.println("Content of Queue " + al);
        System.out.println("Element at the beginning of queue using peek()" + al.peek());
        System.out.println("Element at the beginning of queue using poll()" + al.poll());
        System.out.println("Content of Queue " + al);
        al.remove();
        System.out.println("Content of Queue after removing from the head" + al);
        //Use for each loop
        System.out.println("Use For Each Loop");
        for (String temp : al) {
            System.out.println(temp);
        }
        System.out.println("Use Iterator");
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

	
	}

