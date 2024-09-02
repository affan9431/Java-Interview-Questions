import java.util.Scanner;

public class number_to_word {

    public static void num_to_word() {
        int num;
        System.out.println("Enter the number between 1 to 1000");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen" };
        String[] teens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (num < 1 || num >= 999) {
            System.out.println("Please enter a number between 1 to 1000");
        } else {
            int a = num % 10; // Give last digit in two and three digit number.
            int b = (num / 10) % 10; // Give first digit in two digit number and second digit number in three digit
                                     // number.
            int d = num / 100; // Give first digit in three digit number.

            if (num < 19) {
                System.out.println("" + ones[a]);
            } else if (num >= 20 && num <= 100) {
                System.out.println(teens[b] + " " + ones[a]);
            } else {
                System.out.println(ones[d] + " " + "hundreds" + " " + "and" + " " + teens[b] + " " + ones[a]);
            }
        }

    }

    public static void main(String[] args) {
        num_to_word();
    }

}
