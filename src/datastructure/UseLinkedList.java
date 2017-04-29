package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

			LinkedList<String> al = new LinkedList<String>();
	        // For adding elements in LinkedList, we use add() function
	        al.add("New York");
	        al.add("California");
	        al.add("London");
	        al.add("New Delhi");
	        al.add("Sydney");
	        al.add("Tokyo");
	        System.out.println("Content of LinkedList " + al);
	        System.out.println("Element at second position " + al.get(1));
	        al.remove("Sydney");
	        System.out.println("Content of LinkedList after removing Sydney " + al);
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


