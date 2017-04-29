package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    	
    	   String one = "CAT";
           String two = "ACT";
           char[] charFromOne = one.toCharArray();
           char[] charFromTwo = two.toCharArray();
           Arrays.sort(charFromOne);
           Arrays.sort(charFromTwo);
           if (Arrays.equals(charFromOne, charFromTwo)) {
               System.out.println("The given strings are anagram");
           } else {
               System.out.println("The given strings are not anagram");
           }
       
    }
}
