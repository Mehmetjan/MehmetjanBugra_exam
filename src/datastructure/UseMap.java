package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> list = new HashMap<String, List<String>>();

        List<String> temp = new ArrayList<String>();
        temp.add("New York");
        temp.add("California");
        temp.add("London");
        temp.add("New Delhi");
        temp.add("Sydney");
        temp.add("Tokyo");
        list.put("city", temp);

        List<String> te = new ArrayList<String>();
        te.add("C");
        te.add("Java");
        te.add("Python");
        te.add("Javascript");
        te.add("AngularJS");
        list.put("language", te);

        System.out.println("Use For Each Loop");
        for (Map.Entry<String, List<String>> entry : list.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

        System.out.println("Use Iterator");
        Iterator<Entry<String, List<String>>> iterator = list.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = (Map.Entry<String, List<String>>) iterator.next();
            System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
        }
	}

		
	}


