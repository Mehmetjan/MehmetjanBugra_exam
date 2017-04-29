package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	
		
			ArrayList<String> al = new ArrayList<String>();
	        // For adding elements in ArrayList, we use add() function
	        al.add("C");
	        al.add("Java");
	        al.add("Python");
	        al.add("JavaScript");
	        al.add("Nodejs");
	        al.add("AngularJS");
	        System.out.println("Content of ArrayList " + al);
	        System.out.println("Element at second position " + al.get(1));
	        al.remove("Nodejs");
	        System.out.println("Content of ArrayList after removing Nodejs" + al);
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

