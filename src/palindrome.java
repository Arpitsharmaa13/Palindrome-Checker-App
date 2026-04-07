import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Step 1: Normalize string
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Check palindrome (two-pointer)
        int start = 0;
        int end = cleaned.length() - 1;

        boolean isPalindrome = true;

        while(start < end) {
            if(cleaned.charAt(start) != cleaned.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Output result
        if(isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        sc.close();
    }
}