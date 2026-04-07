import java.util.*;

public class palindrome {

    // Two-pointer approach
    public static boolean twoPointer(String input) {
        int start = 0, end = input.length() - 1;

        while(start < end) {
            if(input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack approach
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for(char ch : input.toCharArray()) {
            if(ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque approach
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new LinkedList<>();

        for(char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // --- Two Pointer ---
        long startTime = System.nanoTime();
        boolean res1 = twoPointer(input);
        long endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // --- Stack ---
        startTime = System.nanoTime();
        boolean res2 = stackMethod(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // --- Deque ---
        startTime = System.nanoTime();
        boolean res3 = dequeMethod(input);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        // Results
        System.out.println("\nResults:");
        System.out.println("Two Pointer: " + res1 + " | Time: " + time1 + " ns");
        System.out.println("Stack: " + res2 + " | Time: " + time2 + " ns");
        System.out.println("Deque: " + res3 + " | Time: " + time3 + " ns");

        sc.close();
    }
}