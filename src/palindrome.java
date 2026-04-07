import java.util.Scanner;
import java.util.Stack;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // push characters into stack
        for(int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverse = "";

        // pop characters (reverse order)
        while(!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        // compare
        if(input.equals(reverse)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        sc.close();
    }
}