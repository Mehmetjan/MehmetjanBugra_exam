package problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        

		String temp = st;
        temp = temp.toLowerCase();
        temp = temp.replaceAll("\\.", "");
        Set<String> duplicates = duplicateWords(temp);
        String totalWords[] = temp.split(" ");
        int count = 0;
        Iterator<String> it = duplicates.iterator();
        while (it.hasNext()) {
            String a = it.next();
            for (String i : totalWords) {
                if (a.equals(i)) {
                    count++;
                }
            }
            System.out.println(a + " occured " + count + " times");
            count = 0;
        }

        String tempo = st;
        tempo = tempo.replaceAll("\\s+", "");
        tempo = tempo.replaceAll("\\.+", "");
        String words[] = st.split("\\s");
        float average = tempo.length() / words.length;
        System.out.println("The average length of the words is " + average);
    }
    public static Set<String> duplicateWords(String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }
    }


