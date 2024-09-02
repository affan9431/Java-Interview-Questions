import java.util.Scanner;

public class character_frequnecy {
    // stringFollowedByNumber() is a function that take string like abbbccc and convert to a1b3c3
    public static void stringFollowedByNumber() {
        String input;
        System.out.println("Enter the chracter like(abbbccc):: ");
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        sc.close();

        StringBuilder output = new StringBuilder();
        int i = 0;

        // check if input conatain any uppercase or not
        if (input.contains(input.toUpperCase())) {
            System.out.println("Please enter English letter in lowercase");
        } else {

            while (i < input.length()) {
                char character = input.charAt(i);
                int count = 0;
                // if i <  input.length() and input conatain any repeated character then increament count and i; 
                while (i < input.length() && input.charAt(i) == character) {
                    count++;
                    i++;
                }
                // append the character and count to output string builder.
                output.append(character).append(count);
            }
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        stringFollowedByNumber();
    }
}
