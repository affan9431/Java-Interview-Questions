/***
 * Question:  Prime Number Checker
 * Owner name: Affan Sayeed
 *  isPrime() is a  method which take number and return if it is prime or not.
 * Date: 3-9-2024
 */

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        // Check if the number is less than or equal to 1; if yes, it's not prime
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println(Constants.OPTION_ONE);
            System.out.println(Constants.OPTION_TWO);
            System.out.println(Constants.ENTER_HERE);
            key = sc.nextInt();

            switch (key) {
                case 1 -> {
                    System.out.println(Constants.ENTER_NUMBER);
                    int num = sc.nextInt();
                    if (num <= 1) {
                        System.out.println(Constants.NEGATIVE_NUMBER_WARN);
                    } else {
                        if (isPrime(num)) {
                            System.out.println("The number " + num + " is prime.");
                        } else {
                            System.out.println("The number " + num + " is not a prime number.");
                        }
                    }
                }
                case 2 -> continueProgram = false;
                default -> System.out.println(Constants.DEFAULT);
            }
        }
        sc.close();
    }
}
