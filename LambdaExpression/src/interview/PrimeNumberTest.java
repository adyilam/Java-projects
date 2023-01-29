package interview;

import java.util.Scanner;

/**
 * Java program to check a given number is prime or not?
 */
public class PrimeNumberTest {

    public static void main(String[] args) {
        //get the user input
        System.out.println("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //calling a method
        boolean result = isPrime(number);

        //print a result
        if (!result) {
            System.out.println(number + "  is Prime");
        } else {
            System.out.println(number + "  is not Prime");
        }

    }

    private static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {   //non prime check
                return true;
            }
        }
        return false;
    }
}


//TIME TO TEST THE PROGRAM

