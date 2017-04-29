package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int fact = 1, number = 5;
        int temp;
        temp = number;
        System.out.println("Factorial using iteration");
        while (temp >= 1) {
            fact = fact * temp;
            temp -= 1;
        }
        System.out.println("Factorial of " + number + " is " + fact);
        System.out.println("Factorial using recursion");
        System.out.println("Factorial of " + number + " is " + factorialRecursion(number));

    }

    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialRecursion(n - 1));
        }
    }
}
