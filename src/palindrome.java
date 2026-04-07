import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();

        // insert characters into deque
        for(int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // compare front and rear
        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // result
        if(isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        sc.close();
    }
}