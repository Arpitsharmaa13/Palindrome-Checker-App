import java.util.Scanner;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reverse = "";

        // reverse logic
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // check palindrome
        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        sc.close();
    }
}