package interview;

/**
 * Java recursive implementation of fibonacci series
 */
public class FibonacciImpl {

    //create a method to print fibonacci number using recursion
    static int fibon(int n) {

        //base case check
        if (n == 1 || n == 2) {
            return 1;
        }

        //recursive case
        return fibon(n - 1) + fibon(n - 2);
    }

    //create a method to print fibonacci number using iterative / loop
    static int fibonacciIterative(int n) {

        //base case check
        if (n == 1 || n == 2) {
            return 1;
        }

        //iterative case
        //fibonacci : fn = fn-1 + fn-2 , it's the sum of the previous two numbers
        int previousFibonacciNum1 = 1;
        int previousFibonacciNumb2 = 2;
        int fibonacci = 1;
        //iterate through the given number
        for (int j = 3; j < n; j++) {
            fibonacci = previousFibonacciNum1 + previousFibonacciNumb2;
            //swap the values
            previousFibonacciNum1 = previousFibonacciNumb2;
            previousFibonacciNumb2 = fibonacci;

        }
        return fibonacci;
    }

}
