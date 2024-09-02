import java.util.Scanner;

public class expand_char {

    // expandCharacter() is a function which take string as input and expand
    // character of string followed by each char.
    public static void expandCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character string like(a23b3c5): ");
        String input = sc.next();
        sc.close(); // close the Scanner class to avoid resource leak.

        // StringBuilder is a class which is use to mutate the string to optimize our
        // code much better.
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char character = input.charAt(i);
            i++;

            // check if string does not conatin number followed by number then it return same string.
            if (i < input.length() && Character.isDigit(input.charAt(i))) {
                StringBuilder number = new StringBuilder();
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    number.append(input.charAt(i));
                    i++;
                }

                int count = Integer.parseInt(number.toString());

                // For loop to expand character
                for (int j = 0; j < count; j++) {
                    output.append(character);
                }
            } else {
                output.append(character);
            }
        }

        System.out.println(output.toString());

    }

    public static void main(String[] args) {
        expandCharacter();
    }
}
