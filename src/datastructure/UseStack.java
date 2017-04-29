package datastructure;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
			Stack<String> al = new Stack<String>();
	        // For adding elements in Stack, we use push() function
	        al.push("New York");
	        al.push("California");
	        al.push("London");
	        al.push("New Delhi");
	        al.push("Sydney");
	        al.push("Tokyo");
	        System.out.println("Content of Stack " + al);
	        System.out.println("Element at the top of stack " + al.peek());
	        int index = al.search("New York");
	        if (index >= 0) {
	            System.out.println("New York is in the Stack");
	        }
	        al.pop();
	        System.out.println("Content of Stack after pop operation " + al);
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
