import java.util.Scanner;

public class PrimeNumber {

    /**
     * This method checks if a given number is prime.
     * A prime number is a number greater than 1 that is only divisible by 1 and itself.
     * 
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime() {
        int num;
        System.out.println("Enter a number: ");
        
        // Read the input number from the user
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        
        // Check if the number is less than or equal to 1; if yes, it's not prime
        if (num <= 1) {
            System.out.println("Number cannot be negative or zero, and it must be greater than 1!");
            return false;
        }

        // Check divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the number is divisible by any number other than 1 and itself, it's not prime
            if (num % i == 0) {
                return false;
            }
        }

        // If no divisors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Check if the input number is prime and display the appropriate message
        if (isPrime()) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not a prime number.");
        }
    }
}
