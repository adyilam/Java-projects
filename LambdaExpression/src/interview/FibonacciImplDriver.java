package interview;


import java.util.Scanner;

import static interview.FibonacciImpl.fibon;
import static interview.FibonacciImpl.fibonacciIterative;

public class FibonacciImplDriver {

    public static void main(String[] args) {

        //get the user input
        System.out.println("ENTER ANY POSITIVE NUMBER: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //displaying the first n numbers
        System.out.println("RECURSIVE METHOD: ");
         for (int i = 1; i <= n; i++) {
            System.out.print(fibon(i) + " "); //import the static method fiboN()
         }

         System.out.println();
        //Now , print the fibonacci number by calling the iterative method
        System.out.println("ITERATIVE METHOD: ");
        for (int j = 1; j <= n; j++) {
            System.out.print(fibonacciIterative(j) + " ");
        }
    }
}
