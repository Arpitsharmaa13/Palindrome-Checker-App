import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App");
        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // convert string to char array
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // two-pointer comparison
        while(start < end) {
            if(arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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